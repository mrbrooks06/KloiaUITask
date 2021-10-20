$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/n11UI.feature");
formatter.feature({
  "name": "n11 Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Favorite functionality test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user closes popups pages",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.stepDef.LoginStepDef.user_closes_popups_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Giris Yap Button",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.LoginStepDef.user_clicks_Giris_Yap_Button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: Element \u003ca class\u003d\"btnSignIn\" href\u003d\"https://www.n11.com/giris-yap\"\u003e is not clickable at point (1135,125) because another element \u003cdiv class\u003d\"seg-popup-overlay\"\u003e obscures it\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Burak-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:c5c:d88a:aef:ca30%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_292\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 93.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210927210923, moz:geckodriverVersion: 0.30.0, moz:headless: false, moz:processID: 1525, moz:profile: /var/folders/tr/4b77hc3d3yz..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: MAC, platformName: MAC, platformVersion: 20.6.0, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 53d563dc-685e-6849-8d34-6fd9dc551975\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\n\tat com.n11.stepDef.LoginStepDef.user_clicks_Giris_Yap_Button(LoginStepDef.java:30)\n\tat ✽.user clicks Giris Yap Button(file:///Users/mrbrooks/IdeaProjects/KloiaUITask/src/test/resources/features/n11UI.feature:13)\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks fb ile giris yap Button",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.LoginStepDef.user_clicks_fb_ile_giris_yap_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters valid credentials to input boxes",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.LoginStepDef.user_enters_valid_credentials_to_input_boxes()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user hover \"Kozmetik \u0026 Kişisel Bakım\" clicks \"Parfüm \u0026 Deodorant\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.FavoriteStepDef.user_hover_clicks(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user search for \"Lacoste\" in  Brand Filter",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.FavoriteStepDef.user_search_for_in_Brand_Filter(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click 7 th product",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.FavoriteStepDef.user_click_th_product(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user add product to Favorites",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.FavoriteStepDef.user_add_product_to_Favorites()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks \"Favorilerim / Listelerim\" from hesabım tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.FavoriteStepDef.user_clicks_from_hesabım_tab(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks Favorilerim Link",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.stepDef.FavoriteStepDef.user_clicks_Favorilerim_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies correct product added to favorite",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.stepDef.FavoriteStepDef.user_verifies_correct_product_added_to_favorite()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});