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
  return Jimp.read(`resources/konzerte/${folder}/Plakat.jpg`)
    .catch(err => Jimp.read(`resources/konzerte/${folder}/Plakat.png`))
    .then(img => img.scaleToFit(128, 128)
      .quality(30)
      .write(`public/konzerte/${folder}/Plakat_128.jpg`))
}

function allowedFileEnding(file) {
  return file.endsWith(".png") || file.endsWith(".jpg") || file.endsWith(".mp3")
}


mkDirs(["public", "public/images", "public/chorleitung", "public/konzerte"])

fs.readdirSync("resources/konzerte").forEach(folder => {
  mkDirs([`public/konzerte/${folder}`])
  createThumbnail(folder)
  fs.readdirSync(`resources/konzerte/${folder}`)
    .filter(allowedFileEnding)
    .forEach(file =>
      copy(`konzerte/${folder}`, file)
    )
})

fs.readdirSync("resources/images")
  .filter(allowedFileEnding)
  .forEach(file => copy("images", file))

fs.readdirSync("resources/chorleitung")
  .filter(allowedFileEnding)
  .forEach(file => copy("chorleitung", file))