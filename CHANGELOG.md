# Changelog

## 0.3.0-alpha (2025-05-09)

Full Changelog: [v0.2.0-alpha...v0.3.0-alpha](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.2.0-alpha...v0.3.0-alpha)

### ⚠ BREAKING CHANGES

* **client:** change precision of some numeric types
* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** Introduce OrganizationConfigRequest model ([b1bc507](https://github.com/m3ter-com/m3ter-sdk-java/commit/b1bc5074859d6a975b9e010e72a366a81f5651cc))
* **api:** Spec fixes ([8150c9a](https://github.com/m3ter-com/m3ter-sdk-java/commit/8150c9ac7459302f9034ebf609b19a02c9ac7ab4))
* **api:** update open api spec ([d3981d7](https://github.com/m3ter-com/m3ter-sdk-java/commit/d3981d7d434a910a648bc62dd7b5ac83ccda5aa2))
* **api:** update OpenAPI spec + associated fixes ([d7a3738](https://github.com/m3ter-com/m3ter-sdk-java/commit/d7a3738c90b42eebb0c8a98c78e76cb216dcd18d))
* **client:** allow providing some params positionally ([3e9c44c](https://github.com/m3ter-com/m3ter-sdk-java/commit/3e9c44cdad6191c03c4a4e63924ef9400a02e403))
* **client:** extract auto pagination to shared classes ([9b42a1e](https://github.com/m3ter-com/m3ter-sdk-java/commit/9b42a1e1ce0fc4edd1759cc51edf566f3d4faf21))


### Performance Improvements

* **internal:** improve compilation+test speed ([bbcdab6](https://github.com/m3ter-com/m3ter-sdk-java/commit/bbcdab6a98c3f838a4ddbc9310eeeae6d312b241))


### Chores

* add missing `params` ([c28819f](https://github.com/m3ter-com/m3ter-sdk-java/commit/c28819f6d9791c6221f94cc368b1b1af97766e6c))
* **ci:** add timeout thresholds for CI jobs ([8df0034](https://github.com/m3ter-com/m3ter-sdk-java/commit/8df00347b7f78fc3eb17d12a0daa64ae896bd2cc))
* **ci:** only use depot for staging repos ([0dbbc55](https://github.com/m3ter-com/m3ter-sdk-java/commit/0dbbc55acad60c1240147812184f511cac6dc085))
* **ci:** run on more branches and use depot runners ([ee58fda](https://github.com/m3ter-com/m3ter-sdk-java/commit/ee58fdabde1e637365e8f430575e67a7ef5ef914))
* **internal:** codegen related update ([a143b4a](https://github.com/m3ter-com/m3ter-sdk-java/commit/a143b4ac36d2c4202ba3b62b0f666e9d36d7b8d0))
* **internal:** java 17 -&gt; 21 on ci ([32cafed](https://github.com/m3ter-com/m3ter-sdk-java/commit/32cafed2588f225cdc7e9a6e40e82161d70b1a0f))
* **internal:** remove flaky `-Xbackend-threads=0` option ([fc7531a](https://github.com/m3ter-com/m3ter-sdk-java/commit/fc7531acf28494664f7d82a07851c5338a071df1))
* **internal:** update java toolchain ([df219b5](https://github.com/m3ter-com/m3ter-sdk-java/commit/df219b525c63cd06260f243e022a84b73f163fcc))
* **internal:** updates ([e0d23b2](https://github.com/m3ter-com/m3ter-sdk-java/commit/e0d23b200ae15762b9bea7314ec15e91bc48faec))


### Documentation

* **client:** update jackson compat error message ([4458cdd](https://github.com/m3ter-com/m3ter-sdk-java/commit/4458cddb670fad4aa20488e28af461ee6071d743))
* explain http client customization ([867618b](https://github.com/m3ter-com/m3ter-sdk-java/commit/867618bb5cc9609f965daa535de01befc92649a8))
* explain jackson compat in readme ([fd85caf](https://github.com/m3ter-com/m3ter-sdk-java/commit/fd85cafdee532933e8f3d8062a2a559b34971ee3))


### Refactors

* **client:** change precision of some numeric types ([960b3c8](https://github.com/m3ter-com/m3ter-sdk-java/commit/960b3c8b079a7bd3680a50cf3153d0b0146ba09e))

## 0.2.0-alpha (2025-04-10)

Full Changelog: [v0.1.1-alpha...v0.2.0-alpha](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.1-alpha...v0.2.0-alpha)

### Features

* **api:** add measurement request model ([6dbe595](https://github.com/m3ter-com/m3ter-sdk-java/commit/6dbe5955274607b417ee458885973226dc1ebc6f))
* **api:** rename DataFieldResponse to DataField and add DerivedField as a model ([bb3bfb9](https://github.com/m3ter-com/m3ter-sdk-java/commit/bb3bfb93e38c28c2eaa0a5b4cb47d7996a6b575b))
* **client:** make pagination robust to missing data ([bed5986](https://github.com/m3ter-com/m3ter-sdk-java/commit/bed598622ef9918c7f53588af6a195c2ef3a5c14))
* **client:** support setting base URL via env var ([#148](https://github.com/m3ter-com/m3ter-sdk-java/issues/148)) ([556a49a](https://github.com/m3ter-com/m3ter-sdk-java/commit/556a49a8d87a14ed7ff49a57b28bb5ca28ff2e3a))


### Bug Fixes

* **client:** bump to better jackson version ([#151](https://github.com/m3ter-com/m3ter-sdk-java/issues/151)) ([4a3b5f0](https://github.com/m3ter-com/m3ter-sdk-java/commit/4a3b5f04797a570bc3a5aaef6e3a4cb52684d0bd))
* use correct base url for client.usage().submit() ([#155](https://github.com/m3ter-com/m3ter-sdk-java/issues/155)) ([393b7be](https://github.com/m3ter-com/m3ter-sdk-java/commit/393b7be18f4b7cd4e55aba008b4c22f8bd01dacc))


### Chores

* **internal:** expand CI branch coverage ([#150](https://github.com/m3ter-com/m3ter-sdk-java/issues/150)) ([8f383c5](https://github.com/m3ter-com/m3ter-sdk-java/commit/8f383c5a81636ddd39418640102a9ac8433f0c4e))
* **internal:** reduce CI branch coverage ([644f79b](https://github.com/m3ter-com/m3ter-sdk-java/commit/644f79bf200e51ca597d58d0e8f4ccceaacf8221))


### Documentation

* add comments for page methods ([bed5986](https://github.com/m3ter-com/m3ter-sdk-java/commit/bed598622ef9918c7f53588af6a195c2ef3a5c14))


### Refactors

* **client:** deduplicate page response classes ([#152](https://github.com/m3ter-com/m3ter-sdk-java/issues/152)) ([bed5986](https://github.com/m3ter-com/m3ter-sdk-java/commit/bed598622ef9918c7f53588af6a195c2ef3a5c14))
* **client:** migrate pages to builder pattern ([#153](https://github.com/m3ter-com/m3ter-sdk-java/issues/153)) ([ca5182f](https://github.com/m3ter-com/m3ter-sdk-java/commit/ca5182f28b4a46f516f05638b22da8d34a79f7e8))

## 0.1.1-alpha (2025-04-09)

Full Changelog: [v0.1.0-alpha...v0.1.1-alpha](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha...v0.1.1-alpha)

### Features

* **api:** change java target to Sonatype portal ([#146](https://github.com/m3ter-com/m3ter-sdk-java/issues/146)) ([3ec5cc4](https://github.com/m3ter-com/m3ter-sdk-java/commit/3ec5cc4e151788f79260cdf6fb20b72b7e667f3c))


### Documentation

* Use "My Org Id" in example requests ([#144](https://github.com/m3ter-com/m3ter-sdk-java/issues/144)) ([c999b68](https://github.com/m3ter-com/m3ter-sdk-java/commit/c999b686fba82ea4b0f22b320209fc0aa1dda1eb))

## 0.1.0-alpha (2025-04-08)

Full Changelog: [v0.1.0-alpha.12...v0.1.0-alpha](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.12...v0.1.0-alpha)

### Features

* **api:** prepare java target for release ([#141](https://github.com/m3ter-com/m3ter-sdk-java/issues/141)) ([fed748f](https://github.com/m3ter-com/m3ter-sdk-java/commit/fed748f72ac1bb481d7a5786c9a5d4191c37138b))
* **api:** update contact email and package name ([#140](https://github.com/m3ter-com/m3ter-sdk-java/issues/140)) ([89be74d](https://github.com/m3ter-com/m3ter-sdk-java/commit/89be74d4ae27e3e6cf0e28364a2314e70ecf0ffb))
* **client:** properly support client-level params ([#143](https://github.com/m3ter-com/m3ter-sdk-java/issues/143)) ([c414348](https://github.com/m3ter-com/m3ter-sdk-java/commit/c414348bc82cd1f6eb6536dedaa081d6e21a6b40))


### Bug Fixes

* **client:** return `Optional&lt;T&gt;` instead of `Optional<? extends T>` ([#137](https://github.com/m3ter-com/m3ter-sdk-java/issues/137)) ([cf5a1ac](https://github.com/m3ter-com/m3ter-sdk-java/commit/cf5a1acc8ea0b4a572b10374b1ed50855f50204d))


### Chores

* **internal:** swap from `getNullable` to `getOptional` ([#136](https://github.com/m3ter-com/m3ter-sdk-java/issues/136)) ([62eba59](https://github.com/m3ter-com/m3ter-sdk-java/commit/62eba595ce65d7b196b22b84928802fd1560b0e2))


### Documentation

* add comments to `JsonField` classes ([cf5a1ac](https://github.com/m3ter-com/m3ter-sdk-java/commit/cf5a1acc8ea0b4a572b10374b1ed50855f50204d))
* document how to forcibly omit required field ([8c95e62](https://github.com/m3ter-com/m3ter-sdk-java/commit/8c95e628895ffbc6f66bc8310c4beb25b28e961a))
* swap examples used in readme ([#139](https://github.com/m3ter-com/m3ter-sdk-java/issues/139)) ([8c95e62](https://github.com/m3ter-com/m3ter-sdk-java/commit/8c95e628895ffbc6f66bc8310c4beb25b28e961a))

## 0.1.0-alpha.12 (2025-04-03)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### Features

* **client:** expose request body setter and getter ([#133](https://github.com/m3ter-com/m3ter-sdk-java/issues/133)) ([f854d60](https://github.com/m3ter-com/m3ter-sdk-java/commit/f854d601b9023bbc183943cfc85a436efdc589d1))
* **java:** roundtrip tests and robust union deserialization ([b909da6](https://github.com/m3ter-com/m3ter-sdk-java/commit/b909da6a452d5b7a7b2492043a25e562813195e8))
* **java:** somewhat lenient date time deserialization ([41d5d58](https://github.com/m3ter-com/m3ter-sdk-java/commit/41d5d581bbf69a23078e406246854e4dd85119df))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#134](https://github.com/m3ter-com/m3ter-sdk-java/issues/134)) ([7fafa58](https://github.com/m3ter-com/m3ter-sdk-java/commit/7fafa586eb9ac7e86adb706c3b56dda71991f478))

## 0.1.0-alpha.11 (2025-03-31)

Full Changelog: [v0.1.0-alpha.10...v0.1.0-alpha.11](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.10...v0.1.0-alpha.11)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods ([#119](https://github.com/m3ter-com/m3ter-sdk-java/issues/119))

### Features

* **client:** support a lower jackson version ([#125](https://github.com/m3ter-com/m3ter-sdk-java/issues/125)) ([15865b0](https://github.com/m3ter-com/m3ter-sdk-java/commit/15865b05e13383b95a475e9cac6e719d72ebd4dc))
* **client:** throw on incompatible jackson version ([15865b0](https://github.com/m3ter-com/m3ter-sdk-java/commit/15865b05e13383b95a475e9cac6e719d72ebd4dc))


### Bug Fixes

* **client:** don't call `validate()` during deserialization if we don't have to ([#127](https://github.com/m3ter-com/m3ter-sdk-java/issues/127)) ([ff799dc](https://github.com/m3ter-com/m3ter-sdk-java/commit/ff799dc9cee568b6739e2090d500057975c20769))
* **client:** limit json deserialization coercion ([#128](https://github.com/m3ter-com/m3ter-sdk-java/issues/128)) ([f5a49a6](https://github.com/m3ter-com/m3ter-sdk-java/commit/f5a49a6e4fe2df7b7196d0e882b85fb94926ae81))
* **client:** map deserialization bug ([1b192f2](https://github.com/m3ter-com/m3ter-sdk-java/commit/1b192f2a346cbf72688df9d20c38180e8281a4a9))
* **client:** support kotlin 1.8 runtime ([#116](https://github.com/m3ter-com/m3ter-sdk-java/issues/116)) ([79b4d09](https://github.com/m3ter-com/m3ter-sdk-java/commit/79b4d090e85f31800e1ff9bc512348e1bfe967a3))


### Chores

* **client:** refactor exception structure and methods ([#119](https://github.com/m3ter-com/m3ter-sdk-java/issues/119)) ([ad77354](https://github.com/m3ter-com/m3ter-sdk-java/commit/ad77354524f638cdbeec5f6c634fbde71753ff42))
* **internal:** add generated comment ([#110](https://github.com/m3ter-com/m3ter-sdk-java/issues/110)) ([2bc3528](https://github.com/m3ter-com/m3ter-sdk-java/commit/2bc352821401360226529750ff8d34bcab8a12cd))
* **internal:** add missing release please block ([#118](https://github.com/m3ter-com/m3ter-sdk-java/issues/118)) ([d819742](https://github.com/m3ter-com/m3ter-sdk-java/commit/d8197425e24f10b0f21aba1c0d15d376e5915c21))
* **internal:** add some tests for union classes ([#115](https://github.com/m3ter-com/m3ter-sdk-java/issues/115)) ([529ddb3](https://github.com/m3ter-com/m3ter-sdk-java/commit/529ddb3f81f7d36147332b56cd3e1e9d380bea05))
* **internal:** delete duplicate tests ([80077a6](https://github.com/m3ter-com/m3ter-sdk-java/commit/80077a6a8ff712a9731d946b74d63ad6bb2f78f7))
* **internal:** delete unused methods and annotations ([#126](https://github.com/m3ter-com/m3ter-sdk-java/issues/126)) ([1b192f2](https://github.com/m3ter-com/m3ter-sdk-java/commit/1b192f2a346cbf72688df9d20c38180e8281a4a9))
* **internal:** fix example formatting ([#121](https://github.com/m3ter-com/m3ter-sdk-java/issues/121)) ([59c445f](https://github.com/m3ter-com/m3ter-sdk-java/commit/59c445fb2f11b1e5450218b12687148d5f427a3d))
* **internal:** generate more tests ([7af2f85](https://github.com/m3ter-com/m3ter-sdk-java/commit/7af2f85223a889a1bf7a5b0c4785ab55257e758a))
* **internal:** make multipart assertions more robust ([2f128a8](https://github.com/m3ter-com/m3ter-sdk-java/commit/2f128a864ee56e41486aa133ee7e5288e957e37a))
* **internal:** make test classes internal ([#108](https://github.com/m3ter-com/m3ter-sdk-java/issues/108)) ([1aeaedc](https://github.com/m3ter-com/m3ter-sdk-java/commit/1aeaedc142061e8cec2738535d14659c12fc32a3))
* **internal:** refactor enum query param serialization ([#117](https://github.com/m3ter-com/m3ter-sdk-java/issues/117)) ([fcd97b4](https://github.com/m3ter-com/m3ter-sdk-java/commit/fcd97b406102d50e0ebb40352872d9bb41de98f6))
* **internal:** refactor query param serialization impl and tests ([#112](https://github.com/m3ter-com/m3ter-sdk-java/issues/112)) ([987a6be](https://github.com/m3ter-com/m3ter-sdk-java/commit/987a6bed429cf26df5852980bdd1a0d1f7ab42b8))
* **internal:** refactor some test assertions ([80077a6](https://github.com/m3ter-com/m3ter-sdk-java/commit/80077a6a8ff712a9731d946b74d63ad6bb2f78f7))
* **internal:** reformat some tests ([#114](https://github.com/m3ter-com/m3ter-sdk-java/issues/114)) ([7af2f85](https://github.com/m3ter-com/m3ter-sdk-java/commit/7af2f85223a889a1bf7a5b0c4785ab55257e758a))
* **internal:** remove unnecessary `assertNotNull` calls ([2f128a8](https://github.com/m3ter-com/m3ter-sdk-java/commit/2f128a864ee56e41486aa133ee7e5288e957e37a))
* **internal:** remove unnecessary import ([#122](https://github.com/m3ter-com/m3ter-sdk-java/issues/122)) ([0fa0605](https://github.com/m3ter-com/m3ter-sdk-java/commit/0fa0605c41ce0e0db5fb29ecbba97efafd73f1f9))
* **internal:** rename `getPathParam` ([#113](https://github.com/m3ter-com/m3ter-sdk-java/issues/113)) ([80077a6](https://github.com/m3ter-com/m3ter-sdk-java/commit/80077a6a8ff712a9731d946b74d63ad6bb2f78f7))
* **internal:** reorder some params methodsc ([80077a6](https://github.com/m3ter-com/m3ter-sdk-java/commit/80077a6a8ff712a9731d946b74d63ad6bb2f78f7))
* **internal:** version bump ([#106](https://github.com/m3ter-com/m3ter-sdk-java/issues/106)) ([c664205](https://github.com/m3ter-com/m3ter-sdk-java/commit/c664205941452dc48d3f480096a33d9e88400095))


### Documentation

* add `build` method comments ([#111](https://github.com/m3ter-com/m3ter-sdk-java/issues/111)) ([84ee9db](https://github.com/m3ter-com/m3ter-sdk-java/commit/84ee9dbdd0f850aecd70333ed1276ea95aa369e9))
* minor readme tweak ([#124](https://github.com/m3ter-com/m3ter-sdk-java/issues/124)) ([11f7cd3](https://github.com/m3ter-com/m3ter-sdk-java/commit/11f7cd3e6e433726f3a7500f1d7dfc578cee09e8))
* refine comments on multipart params ([#120](https://github.com/m3ter-com/m3ter-sdk-java/issues/120)) ([2f128a8](https://github.com/m3ter-com/m3ter-sdk-java/commit/2f128a864ee56e41486aa133ee7e5288e957e37a))
* update readme exception docs ([#123](https://github.com/m3ter-com/m3ter-sdk-java/issues/123)) ([75917d0](https://github.com/m3ter-com/m3ter-sdk-java/commit/75917d0d4ad64efd07abe37b45cc18674b26742b))

## 0.1.0-alpha.10 (2025-03-15)

Full Changelog: [v0.1.0-alpha.9...v0.1.0-alpha.10](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.9...v0.1.0-alpha.10)

### Chores

* **internal:** remove extra empty newlines ([#104](https://github.com/m3ter-com/m3ter-sdk-java/issues/104)) ([96fd2b7](https://github.com/m3ter-com/m3ter-sdk-java/commit/96fd2b70a80e782d19959f9b2f0d542e438a05a2))
* **internal:** version bump ([#102](https://github.com/m3ter-com/m3ter-sdk-java/issues/102)) ([da68a42](https://github.com/m3ter-com/m3ter-sdk-java/commit/da68a428ac4af503df65e87da8958d640b3050ba))


### Documentation

* deduplicate and refine comments ([#105](https://github.com/m3ter-com/m3ter-sdk-java/issues/105)) ([e93bf56](https://github.com/m3ter-com/m3ter-sdk-java/commit/e93bf564c99943c3afff1d729cb6a0156ac07d59))

## 0.1.0-alpha.9 (2025-03-11)

Full Changelog: [v0.1.0-alpha.8...v0.1.0-alpha.9](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.8...v0.1.0-alpha.9)

### Chores

* **internal:** version bump ([#100](https://github.com/m3ter-com/m3ter-sdk-java/issues/100)) ([98eb4f3](https://github.com/m3ter-com/m3ter-sdk-java/commit/98eb4f3ccbc898baba302cefd91d7aa6cbbdb101))

## 0.1.0-alpha.8 (2025-03-10)

Full Changelog: [v0.1.0-alpha.7...v0.1.0-alpha.8](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.7...v0.1.0-alpha.8)

### Features

* generate and publish docs ([#92](https://github.com/m3ter-com/m3ter-sdk-java/issues/92)) ([15ad5f7](https://github.com/m3ter-com/m3ter-sdk-java/commit/15ad5f7036c0f6ddcaab625107229d53d1172126))


### Chores

* **internal:** add `.kotlin` to `.gitignore` ([#94](https://github.com/m3ter-com/m3ter-sdk-java/issues/94)) ([ca780d1](https://github.com/m3ter-com/m3ter-sdk-java/commit/ca780d1cdcc5647f773f6c1123acda595ee053ae))
* **internal:** don't use `JvmOverloads` in interfaces ([da42697](https://github.com/m3ter-com/m3ter-sdk-java/commit/da42697859bc30ab6a085904f33fe3d3a604ba09))
* **internal:** reenable warnings as errors ([#96](https://github.com/m3ter-com/m3ter-sdk-java/issues/96)) ([da42697](https://github.com/m3ter-com/m3ter-sdk-java/commit/da42697859bc30ab6a085904f33fe3d3a604ba09))
* **internal:** use `getOrNull` instead of `orElse(null)` ([#95](https://github.com/m3ter-com/m3ter-sdk-java/issues/95)) ([33328bd](https://github.com/m3ter-com/m3ter-sdk-java/commit/33328bdd0ba95d3d1a5fad3037d4df2f7bc681b4))


### Documentation

* document `JsonValue` construction in readme ([#98](https://github.com/m3ter-com/m3ter-sdk-java/issues/98)) ([abf2b8f](https://github.com/m3ter-com/m3ter-sdk-java/commit/abf2b8fe7005fb2e9a8d1cff76ed93194272fcd8))
* revise readme docs about nested params ([#97](https://github.com/m3ter-com/m3ter-sdk-java/issues/97)) ([666df9d](https://github.com/m3ter-com/m3ter-sdk-java/commit/666df9d96042da789daef7e11837459341fbb1a3))

## 0.1.0-alpha.7 (2025-03-07)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#82](https://github.com/m3ter-com/m3ter-sdk-java/issues/82))

### Features

* **api:** make response model names explicit ([#88](https://github.com/m3ter-com/m3ter-sdk-java/issues/88)) ([0e26079](https://github.com/m3ter-com/m3ter-sdk-java/commit/0e26079ad197b9ca0ee90a246cce0c022b247571))
* **client:** accept `InputStream` and `Path` for file params ([#87](https://github.com/m3ter-com/m3ter-sdk-java/issues/87)) ([3b9c9b2](https://github.com/m3ter-com/m3ter-sdk-java/commit/3b9c9b22cd6170f8c887e5cb35a8b20032ff9d4f))
* **client:** allow configuring timeouts granularly ([#79](https://github.com/m3ter-com/m3ter-sdk-java/issues/79)) ([735f8f7](https://github.com/m3ter-com/m3ter-sdk-java/commit/735f8f7c5deb57542a7f1bea286491ad6a2f162e))
* **client:** detect binary incompatible jackson versions ([#90](https://github.com/m3ter-com/m3ter-sdk-java/issues/90)) ([d3f17db](https://github.com/m3ter-com/m3ter-sdk-java/commit/d3f17db29cc7069913913fe7e473cc92f8c22894))
* **client:** support raw response access ([#81](https://github.com/m3ter-com/m3ter-sdk-java/issues/81)) ([bbd1527](https://github.com/m3ter-com/m3ter-sdk-java/commit/bbd15272c0301635ebcf0c5177cd62a552598ec6))


### Chores

* **client:** expose `Optional`, not nullable, from `ClientOptions` ([#85](https://github.com/m3ter-com/m3ter-sdk-java/issues/85)) ([6cef27f](https://github.com/m3ter-com/m3ter-sdk-java/commit/6cef27ffd3299e5045a9c5d77ce23670ee3b032c))
* **client:** refactor multipart formdata impl ([#82](https://github.com/m3ter-com/m3ter-sdk-java/issues/82)) ([0589a2c](https://github.com/m3ter-com/m3ter-sdk-java/commit/0589a2ce7baca8718966ec62e7b94d20afba5dfe))


### Documentation

* add raw response readme documentation ([#83](https://github.com/m3ter-com/m3ter-sdk-java/issues/83)) ([e444138](https://github.com/m3ter-com/m3ter-sdk-java/commit/e444138d63cca66edc53ce36dabb04632fb2f2f2))
* note required fields in `builder` javadoc ([#84](https://github.com/m3ter-com/m3ter-sdk-java/issues/84)) ([a81eecb](https://github.com/m3ter-com/m3ter-sdk-java/commit/a81eecb7ac2be840e951cc7986b5382895e08a10))

## 0.1.0-alpha.6 (2025-03-04)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* **api:** manual updates ([#75](https://github.com/m3ter-com/m3ter-sdk-java/issues/75)) ([da2ad57](https://github.com/m3ter-com/m3ter-sdk-java/commit/da2ad57bf4c0aa6f38d647a4a14a0b25d36dae53))

## 0.1.0-alpha.5 (2025-03-04)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/m3ter-com/m3ter-sdk-java/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **api:** fixing warnings ([#72](https://github.com/m3ter-com/m3ter-sdk-java/issues/72)) ([16fac0e](https://github.com/m3ter-com/m3ter-sdk-java/commit/16fac0e96ea1a3b215d29ebebaed230e8c6f0baf))

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
