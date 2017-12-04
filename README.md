# MVVM-Recyclerview-Binding-Dynamic-Edittext-Using-Room-Object
MVVM Recyclerview Binding Dynamic Edittext Using Room Object

Recycler view implement using MVVM and following libraries.

compile 'com.android.support:appcompat-v7:' + rootProject.supportLibVersion;
compile 'com.android.support:cardview-v7:' + rootProject.supportLibVersion;
compile 'com.android.support:recyclerview-v7:' + rootProject.supportLibVersion;
compile 'android.arch.lifecycle:extensions:' + rootProject.archLifecycleVersion;
compile 'android.arch.persistence.room:runtime:' + rootProject.archRoomVersion;
annotationProcessor "android.arch.lifecycle:compiler:" + rootProject.archLifecycleVersion;
annotationProcessor "android.arch.persistence.room:compiler:" + rootProject.archRoomVersion;

![Alt text](/docs/images/VM_diagram.png?raw=true "MVVM Recyclerview Binding Dynamic Edittext Using Room Object")
![Alt text](/docs/images/VM_subscriptions.png?raw=true "MVVM Recyclerview Binding Dynamic Edittext Using Room Object")
