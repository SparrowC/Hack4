#Preference使用
- activity需要继承PreferenceActivity
- 新建一个xml文件，如下：
###preference_layout.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<PreferenceScreen
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:key="pref_key"
    android:title="Preference">
    <PreferenceCategory android:title="user">
        <EditTextPreference android:key="pref_username"
            android:summary="username"
            android:title="username"/>
    </PreferenceCategory>

    <PreferenceCategory android:title="App">
        <Preference android:key="pref_rate"
            android:summary="rate the app in the store!"
            android:title="rate app"/>
        <Preference android:key="pref_share"
            android:summary="share with you friends"
            android:title="share it"/>
    </PreferenceCategory>
</PreferenceScreen>
```
- 在Activity中，通过addPreferencesFromResource(R.xml.preference_layout)来加载布局，而不是用setContentView()。


