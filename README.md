# cljs-test-issue

The `cljs.test/run-tests` function produces stale output when using boot-cljs and auto-compilation.

### To reproduce with Boot:

- Compile

```
cd boot
boot go
```

- Load `target/index.html` and verify console output shows one test

- Uncomment last test in `src/app/test.cljs`

- Reload `target/index.html` and console output **only shows one test**

### Control group: cljs quick start method:

- Compile

```
cd quick-start
wget https://github.com/clojure/clojurescript/releases/download/r1.7.48/cljs.jar
java -cp cljs.jar:src clojure.main watch.clj
```

- Load `index.html` and verify console output shows one test

- Uncomment last test in `src/hello_world/test.cljs`

- Reload `index.html` and console output **shows two tests**
