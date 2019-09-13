package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.roughike.facebooklogin.facebooklogin.FacebookLoginPlugin;
import com.flutter_webview_plugin.FlutterWebviewPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FacebookLoginPlugin.registerWith(registry.registrarFor("com.roughike.facebooklogin.facebooklogin.FacebookLoginPlugin"));
    FlutterWebviewPlugin.registerWith(registry.registrarFor("com.flutter_webview_plugin.FlutterWebviewPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
