# HARU

# モジュールの自動インクルード機能

`core/` や `feature/` 配下のサブモジュールを自動的に `settings.gradle.kts` にインクルードします。

`includeAllUnder(path: String, prefix: String)` という関数を使い、

- 指定ディレクトリのサブフォルダに `build.gradle.kts` があれば自動でモジュールとして登録
- 存在しないディレクトリやモジュールがなければログにエラー出力
- モジュール名に `prefix` を付与可能で名前空間管理に便利

呼び出し例：

```kotlin
include(":app")
includeAllUnder(path = "core", prefix = ":core:")
includeAllUnder(path = "feature", prefix = ":feature:")
```
