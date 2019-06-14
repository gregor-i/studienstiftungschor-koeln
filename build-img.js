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
  console.log(`copying resources/${folder}/${file} to public/${folder}/${file}`)
  fs.copyFileSync(`resources/${folder}/${file}`, `public/${folder}/${file}`)
}

function createThumbnail(folder) {
  console.log(`creating Thumbnail resources/konzerte/${folder}/Plakat.jpg to public/konzerte/${folder}/Plakat_128.jpg`)
  return Jimp.read(`resources/konzerte/${folder}/Plakat.jpg`)
    .catch(err => Jimp.read(`resources/konzerte/${folder}/Plakat.png`))
    .then(img => img.scaleToFit(128, 128)
      .quality(30)
      .write(`public/konzerte/${folder}/Plakat_128.jpg`))
}

function createPlakat(folder) {
  console.log(`downsizing resources/konzerte/${folder}/Plakat.jpg to public/konzerte/${folder}/Plakat.jpg`)
  return Jimp.read(`resources/konzerte/${folder}/Plakat.jpg`)
    .catch(err => Jimp.read(`resources/konzerte/${folder}/Plakat.png`))
    .then(img => img.quality(80)
      .write(`public/konzerte/${folder}/Plakat.jpg`))
}

function allowedFileEnding(file) {
  return file.endsWith(".png") || file.endsWith(".jpg") || file.endsWith(".mp3")
}

function notPlakat(file){
  return !file.endsWith("Plakat.jpg")
}

mkDirs(["public", "public/images", "public/chorleitung", "public/konzerte"])

fs.readdirSync("resources/konzerte").forEach(folder => {
  mkDirs([`public/konzerte/${folder}`])
  createThumbnail(folder)
  fs.readdirSync(`resources/konzerte/${folder}`)
    .filter(allowedFileEnding)
    .filter(notPlakat)
    .forEach(file =>
      copy(`konzerte/${folder}`, file)
    )
  createThumbnail(folder)
  createPlakat(folder)
})

console.log(`creating Thumbnail resources/konzerte/SS19/Plakat.jpg to public/konzerte/SS19/Plakat_home.jpg`)
Jimp.read(`resources/konzerte/SS19/Plakat.jpg`)
    .then(img => img.scaleToFit(504, 648)
        .quality(80)
        .write(`public/konzerte/SS19/Plakat_home.jpg`))

fs.readdirSync("resources/images")
  .filter(allowedFileEnding)
  .forEach(file => copy("images", file))

fs.readdirSync("resources/chorleitung")
  .filter(allowedFileEnding)
  .forEach(file => copy("chorleitung", file))
