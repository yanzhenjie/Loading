# Loading

A MaterialDesign style LoadingView. Currently only for my own open source project, it comes from [LoadingDrawable](https://github.com/dinuscxj/LoadingDrawable), recommend using the [LoadingDrawable](https://github.com/dinuscxj/LoadingDrawable).

[中文文档](./README-CN.md)  

----

# Screenshot
<image src="./image/1.gif" width="170px"/>

# Dependencies
* Gradle
```groovy
compile 'com.yanzhenjie:loading:1.0.2'
```

* Maven
```xml
<dependency>
  <groupId>com.yanzhenjie</groupId>
  <artifactId>loading</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
```

# Usage

**XML or Java**:  
```xml
<com.yanzhenjie.loading.LoadingView
    android:id="@+id/loading_view"
    android:layout_width="150dp"
    android:layout_height="150dp" />

// Or java:  
LoadingView loadView = new LoadingView(context);
```

The default is a white circle, change color:  
```java
LoadingView loadView;
loadView.setCircleColors(color1, color2, color3);
```

It will automatically turn up.  

**Default Dialog**:  
```java
Dialog mWaitDialog = new LoadingDialog(context);
mWaitDialog.setMessage(R.string.loading_wait);
// mWaitDialog.setMessage("Please wait...");
mWaitDialog.setCircleColors(...);
mWaitDialog.show();
```

# Thanks
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