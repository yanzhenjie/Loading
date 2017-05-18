# Loading

一个MD风格的LoadingView，它来自项目[LoadingDrawable](https://github.com/dinuscxj/LoadingDrawable)，因为我的开源项目需要用到Loading，所以我把它扣出来了，只是为了我的其它开源项目方便使用，推荐使用原作者的[LoadingDrawable](https://github.com/dinuscxj/LoadingDrawable)。

[English Document](./README.md)  

----

# 截图
<image src="./image/1.gif" width="170px"/> <image src="./image/2.gif" width="170px"/>

# 依赖
* Gradle
```groovy
compile 'com.yanzhenjie:loading:1.0.0'
```

* Maven
```xml
<dependency>
  <groupId>com.yanzhenjie</groupId>
  <artifactId>loading</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

# 使用说明

XML:
```xml
<com.yanzhenjie.loading.LoadingView
    android:id="@+id/loading_view"
    android:layout_width="150dp"
    android:layout_height="150dp" />
```

其它什么都不用做，它会自动运转起来。

默认Dialog:
```java
Dialog mWaitDialog = new LoadingDialog(context);
mWaitDialog.show();
```

# 感谢以下项目及作者
[LoadingDrawable](https://github.com/dinuscxj/LoadingDrawable)

# License
```text
Copyright © Yan Zhenjie

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```