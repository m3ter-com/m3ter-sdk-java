# Changelog

## 0.1.0-alpha.2 (2025-01-30)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** updated OpenAPI spec ([#35](https://github.com/m3ter-com/m3ter-sdk-java/issues/35)) ([6cf58a6](https://github.com/m3ter-com/m3ter-sdk-java/commit/6cf58a6b224d57e5850f49833dbd4d93c120e52c))

## 0.1.0-alpha.1 (2025-01-29)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **client:** add `_queryParams` and `_headers` methods ([#26](https://github.com/m3ter-com/m3ter-sdk-java/issues/26)) ([8342b11](https://github.com/m3ter-com/m3ter-sdk-java/commit/8342b111caa5c7e1058bbb57d3d514056c90c093))
* various codegen changes ([260b651](https://github.com/m3ter-com/m3ter-sdk-java/commit/260b651cdef4fba521a338f439d5647e0fdc4219))


### Bug Fixes

* **client:** don't leak responses when retrying ([#31](https://github.com/m3ter-com/m3ter-sdk-java/issues/31)) ([ff857b5](https://github.com/m3ter-com/m3ter-sdk-java/commit/ff857b542c7dbbacd928df81bb6e341cbfd31fb4))
* deduplicate unknown entries in union ([#28](https://github.com/m3ter-com/m3ter-sdk-java/issues/28)) ([160a3fe](https://github.com/m3ter-com/m3ter-sdk-java/commit/160a3fee9bf58e64dd15edd2196a02b643312484))


### Chores

* go live ([beb09cd](https://github.com/m3ter-com/m3ter-sdk-java/commit/beb09cde1f80750692a712e31a1c0d2d757f20c7))
* **internal:** improve `RetryingHttpClientTest` ([#29](https://github.com/m3ter-com/m3ter-sdk-java/issues/29)) ([56be023](https://github.com/m3ter-com/m3ter-sdk-java/commit/56be023f4ba6a26940256455218a248bb249a2c1))


### Refactors

* **internal:** extract request preparation logic ([8342b11](https://github.com/m3ter-com/m3ter-sdk-java/commit/8342b111caa5c7e1058bbb57d3d514056c90c093))
