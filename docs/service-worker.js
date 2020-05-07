// find * | grep \\. | grep -v gitkeep

var cacheName = 'static';
var appShellFiles = [
  "chorleitung/Paul-Kraemer2012.jpg",
  "chorleitung/Vera_Cremer.jpg",
  "chorleitung/Johanna_Kathi.jpg",
  "chorleitung.html",
  "fa-solid-900.eot",
  "fa-solid-900.svg",
  "fa-solid-900.ttf",
  "fa-solid-900.woff",
  "fa-solid-900.woff2",
  "images/stipendiaten-machen-programm.jpg",
  "images/app_icon.svg",
  "images/favicon.svg",
  "images/Plakat-to-be-defined.svg",
  "images/logo.svg",
  "images/hero.jpg",
  "index.html",
  "kontakt.html",
  "konzerte/SS17/Plakat_128.jpg",
  "konzerte/SS17/Plakat.jpg",
  "konzerte/SS17/On_this_shining_night.jpg",
  "konzerte/SS17/Konzert_Nacht.mp3",
  "konzerte/SS15/Plakat_128.jpg",
  "konzerte/SS15/Plakat.jpg",
  "konzerte/SS15/Plakat.png",
  "konzerte/SS15/Romantikkonzert.jpg",
  "konzerte/SS15/Romantikkonzert_15.mp3",
  "konzerte/WS13/Konzert_Nov2013.jpg",
  "konzerte/WS13/Plakat_128.jpg",
  "konzerte/WS13/Plakat.jpg",
  "konzerte/WS13/Konzert_30112013_09.mp3",
  "konzerte/WS19/Plakat_128.jpg",
  "konzerte/WS19/Plakat.jpg",
  "konzerte/WS19/Plakat_home.jpg",
  "konzerte/SS14/Plakat_128.jpg",
  "konzerte/SS14/02_Tonight.mp3",
  "konzerte/SS14/konzert16_sml.jpg",
  "konzerte/SS14/Plakat.jpg",
  "konzerte/WS14/Plakat_128.jpg",
  "konzerte/WS14/Plakat.jpg",
  "konzerte/WS14/Adventskonzert_klein.jpg",
  "konzerte/WS14/The_Lord_bless_you.mp3",
  "konzerte/WS17/Plakat_128.jpg",
  "konzerte/WS17/Konzert_Christmas.mp3",
  "konzerte/WS17/Plakat.jpg",
  "konzerte/WS17/Let_Earth.jpg",
  "konzerte/SS18/Chor.jpg",
  "konzerte/SS18/Plakat_128.jpg",
  "konzerte/SS18/Plakat.jpg",
  "konzerte/SS18/Air-Konzert.mp3",
  "konzerte/SS19/Plakat_128.jpg",
  "konzerte/SS19/Plakat.jpg",
  "konzerte/SS16/Plakat_128.jpg",
  "konzerte/SS16/Nordlichter_2.jpg",
  "konzerte/SS16/Plakat.jpg",
  "konzerte/WS18/Plakat_128.jpg",
  "konzerte/WS18/Plakat.jpg",
  "konzerte/WS12/Plakat_128.jpg",
  "konzerte/WS12/Plakat.jpg",
  "konzerte/WS12/Spaetherbst.jpg",
  "konzerte/WS16/Plakat_128.jpg",
  "konzerte/WS16/14-Ave_verum.mp3",
  "konzerte/WS16/Plakat.jpg",
  "konzerte/WS16/Machet_die_Tore.jpg",
  "konzerte/WS15/Plakat_128.jpg",
  "konzerte/WS15/Viva_la_Vida_Konzert.mp3",
  "konzerte/WS15/Viva_la_Vida_sml.jpg",
  "konzerte/WS15/Plakat.jpg",
  "konzerte/SS13/Schoepfung_11_Chor.mp3",
  "konzerte/SS13/Plakat_128.jpg",
  "konzerte/SS13/Plakat.jpg",
  "konzerte.html",
  "manifest.json",
  "mitsingen.html",
  "script.js",
  "service-worker.js",
  "sitemap.xml",
  "style.css",
  "ueber-uns.html",
  "/",
];

self.addEventListener('install', (e) => {
  console.log('[Service Worker] Install');
  e.waitUntil(
    caches.open(cacheName).then((cache) => {
          console.log('[Service Worker] Caching all: app shell');
      return cache.addAll(appShellFiles);
    })
  );
});

self.addEventListener('fetch', (e) => {
  e.respondWith(
    caches.match(e.request).then((r) => {
          console.log('[Service Worker] Fetching resource: '+e.request.url);
      return r || fetch(e.request).then((response) => {
                return caches.open(cacheName).then((cache) => {
          console.log('[Service Worker] Caching new resource: '+e.request.url);
          cache.put(e.request, response.clone());
          return response;
        });
      });
    })
  );
});
