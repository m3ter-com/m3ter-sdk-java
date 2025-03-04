# Changelog

## 0.1.0-alpha.4 (2025-03-03)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Chores

* **internal:** codegen related update ([#70](https://github.com/m3ter-com/m3ter-sdk-java/issues/70)) ([c5bd097](https://github.com/m3ter-com/m3ter-sdk-java/commit/c5bd097fe8eddded1a41575cded480bb3d221e41))

## 0.1.0-alpha.3 (2025-02-25)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* **api:** add more endpoints ([#46](https://github.com/m3ter-com/m3ter-sdk-java/issues/46)) ([8bac489](https://github.com/m3ter-com/m3ter-sdk-java/commit/8bac4890210c94039bd3913d6c89cb044f30cc8b))
* **api:** add orgId path param to client settings ([#58](https://github.com/m3ter-com/m3ter-sdk-java/issues/58)) ([23a9522](https://github.com/m3ter-com/m3ter-sdk-java/commit/23a952219f1f8c86513340484240ee3fc29494b2))
* **api:** Config update ([#40](https://github.com/m3ter-com/m3ter-sdk-java/issues/40)) ([8cea710](https://github.com/m3ter-com/m3ter-sdk-java/commit/8cea7105200b14ddb45f9a02e05f6767fdccac84))
* **api:** create ad hoc data export endpoint ([#52](https://github.com/m3ter-com/m3ter-sdk-java/issues/52)) ([2efa612](https://github.com/m3ter-com/m3ter-sdk-java/commit/2efa612f56ae408fd4a387998ade68b226fa2917))
* **api:** Update custom field type information ([#43](https://github.com/m3ter-com/m3ter-sdk-java/issues/43)) ([c01d4df](https://github.com/m3ter-com/m3ter-sdk-java/commit/c01d4dfb4e36e2d6520b71024c8036919d763872))
* **api:** update open api spec ([#67](https://github.com/m3ter-com/m3ter-sdk-java/issues/67)) ([ca53434](https://github.com/m3ter-com/m3ter-sdk-java/commit/ca53434d2a2831311959cc4e57b3017f8f6d90d0))
* **client:** get rid of annoying checked exceptions ([#62](https://github.com/m3ter-com/m3ter-sdk-java/issues/62)) ([13f96c8](https://github.com/m3ter-com/m3ter-sdk-java/commit/13f96c8dd32ae1db42d49277473fbbdf20531337))
* **client:** send client-side timeout headers ([#42](https://github.com/m3ter-com/m3ter-sdk-java/issues/42)) ([ba9dfbe](https://github.com/m3ter-com/m3ter-sdk-java/commit/ba9dfbeba79a70202281c2569b95b067b974ad82))
* **client:** support `JsonField#asX()` for known values ([#56](https://github.com/m3ter-com/m3ter-sdk-java/issues/56)) ([4ab97f6](https://github.com/m3ter-com/m3ter-sdk-java/commit/4ab97f6a1694bf5ddcc5b1275b75c96f7261998d))
* **client:** update enum `asX` methods ([#55](https://github.com/m3ter-com/m3ter-sdk-java/issues/55)) ([2616e57](https://github.com/m3ter-com/m3ter-sdk-java/commit/2616e573b363018dda3aa2918e4ba43bf982e31c))


### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#45](https://github.com/m3ter-com/m3ter-sdk-java/issues/45)) ([e1250f9](https://github.com/m3ter-com/m3ter-sdk-java/commit/e1250f94e8f1cda3594e7ad352f163b590579e1c))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([e1250f9](https://github.com/m3ter-com/m3ter-sdk-java/commit/e1250f94e8f1cda3594e7ad352f163b590579e1c))
* **client:** add missing validation calls on response ([e1250f9](https://github.com/m3ter-com/m3ter-sdk-java/commit/e1250f94e8f1cda3594e7ad352f163b590579e1c))
* **client:** always provide a body for `PATCH` methods ([e1250f9](https://github.com/m3ter-com/m3ter-sdk-java/commit/e1250f94e8f1cda3594e7ad352f163b590579e1c))
* **client:** mark some request bodies as optional ([#64](https://github.com/m3ter-com/m3ter-sdk-java/issues/64)) ([2f3f4bd](https://github.com/m3ter-com/m3ter-sdk-java/commit/2f3f4bda162bc790689b3c8f563c11b887929f71))


### Chores

* **ci:** update gradle actions to v4 ([#60](https://github.com/m3ter-com/m3ter-sdk-java/issues/60)) ([4871f17](https://github.com/m3ter-com/m3ter-sdk-java/commit/4871f17ca6656c32506a7e6e761ab2e5cc4ec5cc))
* **docs:** add faq to readme ([#63](https://github.com/m3ter-com/m3ter-sdk-java/issues/63)) ([990ccc8](https://github.com/m3ter-com/m3ter-sdk-java/commit/990ccc89c86447c3189599c6f10b1a5cfc6e1e74))
* **docs:** reorganize readme ([#57](https://github.com/m3ter-com/m3ter-sdk-java/issues/57)) ([a3b56b5](https://github.com/m3ter-com/m3ter-sdk-java/commit/a3b56b5319a531c285365f4b41a7a46244cb1a62))
* **internal:** codegen related update ([#48](https://github.com/m3ter-com/m3ter-sdk-java/issues/48)) ([2aef734](https://github.com/m3ter-com/m3ter-sdk-java/commit/2aef7340816d611c3dfd9daa240ca28fc34b7fc5))
* **internal:** codegen related update ([#51](https://github.com/m3ter-com/m3ter-sdk-java/issues/51)) ([e300aec](https://github.com/m3ter-com/m3ter-sdk-java/commit/e300aec1a1abcad8b46e89603900d404b2473655))
* **internal:** codegen related update ([#61](https://github.com/m3ter-com/m3ter-sdk-java/issues/61)) ([ed6ad11](https://github.com/m3ter-com/m3ter-sdk-java/commit/ed6ad1140608d93ecc8881476970a74f29f97136))
* **internal:** get rid of configuration cache ([#59](https://github.com/m3ter-com/m3ter-sdk-java/issues/59)) ([a385e7c](https://github.com/m3ter-com/m3ter-sdk-java/commit/a385e7cdf7a9cfe669dbaeabd2131b9e6c320a4f))
* **internal:** make body class constructors private ([0ad1a4e](https://github.com/m3ter-com/m3ter-sdk-java/commit/0ad1a4e6a2a7b190deef3fbabaeb5cb673052cf0))
* **internal:** make body classes for multipart requests ([0ad1a4e](https://github.com/m3ter-com/m3ter-sdk-java/commit/0ad1a4e6a2a7b190deef3fbabaeb5cb673052cf0))
* **internal:** minor formatting/style changes ([e1250f9](https://github.com/m3ter-com/m3ter-sdk-java/commit/e1250f94e8f1cda3594e7ad352f163b590579e1c))
* **internal:** misc formatting changes ([0ad1a4e](https://github.com/m3ter-com/m3ter-sdk-java/commit/0ad1a4e6a2a7b190deef3fbabaeb5cb673052cf0))
* **internal:** optimize build and test perf ([2089741](https://github.com/m3ter-com/m3ter-sdk-java/commit/2089741ba0a85561d1bc0e8a52cfe2b141282dcd))
* **internal:** refactor `PhantomReachableClosingAsyncStreamResponse` impl ([#50](https://github.com/m3ter-com/m3ter-sdk-java/issues/50)) ([f7b4b1a](https://github.com/m3ter-com/m3ter-sdk-java/commit/f7b4b1a5182fd3765eb1421679cdad3a0c55f190))
* **internal:** remove unnecessary non-null asserts in tests ([2f3f4bd](https://github.com/m3ter-com/m3ter-sdk-java/commit/2f3f4bda162bc790689b3c8f563c11b887929f71))
* **internal:** rename internal body classes ([0ad1a4e](https://github.com/m3ter-com/m3ter-sdk-java/commit/0ad1a4e6a2a7b190deef3fbabaeb5cb673052cf0))
* **internal:** rename some tests ([e1250f9](https://github.com/m3ter-com/m3ter-sdk-java/commit/e1250f94e8f1cda3594e7ad352f163b590579e1c))
* **internal:** update formatter ([#53](https://github.com/m3ter-com/m3ter-sdk-java/issues/53)) ([2089741](https://github.com/m3ter-com/m3ter-sdk-java/commit/2089741ba0a85561d1bc0e8a52cfe2b141282dcd))
* **internal:** update some formatting in `Values.kt` ([4ab97f6](https://github.com/m3ter-com/m3ter-sdk-java/commit/4ab97f6a1694bf5ddcc5b1275b75c96f7261998d))
* **internal:** use `assertNotNull` in tests for type narrowing ([2f3f4bd](https://github.com/m3ter-com/m3ter-sdk-java/commit/2f3f4bda162bc790689b3c8f563c11b887929f71))
* **internal:** use better test example values ([#54](https://github.com/m3ter-com/m3ter-sdk-java/issues/54)) ([0ad1a4e](https://github.com/m3ter-com/m3ter-sdk-java/commit/0ad1a4e6a2a7b190deef3fbabaeb5cb673052cf0))
* minor change to tests ([#47](https://github.com/m3ter-com/m3ter-sdk-java/issues/47)) ([5a4a4c7](https://github.com/m3ter-com/m3ter-sdk-java/commit/5a4a4c73ce8fadcfca252ee2589bc77ff591ac41))


### Documentation

* add immutability explanation to readme ([#65](https://github.com/m3ter-com/m3ter-sdk-java/issues/65)) ([a9dbbb2](https://github.com/m3ter-com/m3ter-sdk-java/commit/a9dbbb2d5b27701ec2d4d0b6ac2b44215bb1c4d3))
* add more phantom reachability docs ([f7b4b1a](https://github.com/m3ter-com/m3ter-sdk-java/commit/f7b4b1a5182fd3765eb1421679cdad3a0c55f190))
* add source file links to readme ([#66](https://github.com/m3ter-com/m3ter-sdk-java/issues/66)) ([1fa450b](https://github.com/m3ter-com/m3ter-sdk-java/commit/1fa450bb6a8a356236af353432c3055512503124))
* fix incorrect additional properties info ([#38](https://github.com/m3ter-com/m3ter-sdk-java/issues/38)) ([dcd5f5d](https://github.com/m3ter-com/m3ter-sdk-java/commit/dcd5f5dd6777814d7ee65e943cb1ffac2c5f041a))

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
