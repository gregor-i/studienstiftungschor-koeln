const Jimp = require('jimp');
const fs = require('fs');

function mkDirs(dirs) {
  dirs.forEach(d => {
    try {
      fs.mkdirSync(d)
    } catch (e) {
    }
  })
}

function copy(folder, file) {
  console.log(`copying resources/${folder}/${file} to docs/${folder}/${file}`)
  fs.copyFileSync(`resources/${folder}/${file}`, `docs/${folder}/${file}`)
}

function createThumbnail(folder) {
  console.log(`creating Thumbnail resources/konzerte/${folder}/Plakat.jpg to docs/konzerte/${folder}/Plakat_128.jpg`)
  return Jimp.read(`resources/konzerte/${folder}/Plakat.jpg`)
    .catch(err => Jimp.read(`resources/konzerte/${folder}/Plakat.png`))
    .then(img => img.scaleToFit(128, 128)
      .quality(30)
      .write(`docs/konzerte/${folder}/Plakat_128.jpg`))
}

function createPlakat(folder) {
  console.log(`downsizing resources/konzerte/${folder}/Plakat.jpg to docs/konzerte/${folder}/Plakat.jpg`)
  return Jimp.read(`resources/konzerte/${folder}/Plakat.jpg`)
    .catch(err => Jimp.read(`resources/konzerte/${folder}/Plakat.png`))
    .then(img =>
      img.scaleToFit(1400, 1400)
      .quality(70)
      .write(`docs/konzerte/${folder}/Plakat.jpg`))
}

function allowedFileEnding(file) {
  return file.endsWith(".png") || file.endsWith(".jpg") || file.endsWith(".mp3")
}

function notPlakat(file){
  return !file.endsWith("Plakat.jpg")
}

mkDirs(["docs", "docs/images", "docs/chorleitung", "docs/konzerte"])

fs.readdirSync("resources/konzerte").forEach(folder => {
  mkDirs([`docs/konzerte/${folder}`])
  fs.readdirSync(`resources/konzerte/${folder}`)
    .filter(allowedFileEnding)
    .filter(notPlakat)
    .forEach(file =>
      copy(`konzerte/${folder}`, file)
    )
  createThumbnail(folder)
  createPlakat(folder)
})

console.log(`creating Homepage Image`)
Jimp.read(`resources/konzerte/WS19/Plakat.jpg`)
    .then(img => img.scaleToFit(504, 800)
        .quality(70)
        .write(`docs/konzerte/WS19/Plakat_home.jpg`))

fs.readdirSync("resources/images")
  .filter(allowedFileEnding)
  .forEach(file => copy("images", file))

fs.readdirSync("resources/chorleitung")
  .filter(allowedFileEnding)
  .forEach(file => copy("chorleitung", file))
