# Loading

一个MD风格的LoadingView，它来自项目[LoadingDrawable](https://github.com/dinuscxj/LoadingDrawable)，因为我的开源项目需要用到Loading，所以我把它扣出来了，只是为了我的其它开源项目方便使用，推荐使用原作者的[LoadingDrawable](https://github.com/dinuscxj/LoadingDrawable)。

[English Document](./README.md)  

----

# 截图
<image src="./image/1.gif" width="170px"/>

# 依赖
* Gradle
```groovy
compile 'com.yanzhenjie:loading:1.0.1'
```

* Maven
```xml
<dependency>
  <groupId>com.yanzhenjie</groupId>
  <artifactId>loading</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

# 使用说明

**XML或者Java中**：  
```xml
<com.yanzhenjie.loading.LoadingView
    android:id="@+id/loading_view"
    android:layout_width="150dp"
    android:layout_height="150dp" />

// 或者Java：
LoadingView loadView = new LoadingView(context);
```

默认是一个白色的圆，你也可以改变颜色：    
```java
LoadingView loadView;
loadView.setCircleColors(color1, color2, color3);
```

**使用默认的Dialog**：  
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