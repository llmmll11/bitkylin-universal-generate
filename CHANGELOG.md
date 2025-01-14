<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# Changelog

## [Unreleased]

## [1.0.7] - 2023-09-11

### Added

- add "Intention Action"、"Intention Action Preview"
- Optimize various error reporting, currently disable handling of interface classes and enum classes
- Remove redundant tri-party dependencies and dramatically reduce plugin size

### 添加

- 新增 "意图"、"意图预览"
- 优化各种报错，目前禁用对枚举类的处理
- 去除冗余的三方依赖，大幅缩减插件体积

## [0.9.12] - 2023-08-15

### Added

- Populate the JavaDoc with class field descriptions or method parameter field descriptions based on the same name field
  in the project, exact or fuzzy matching annotations and Swagger annotations.
- Add the deletion function of JavaDoc, Swagger annotations and Protostuff annotations.
- Optimize the display of the right-click menu

### 添加

- 根据项目中的同名字段，精确或模糊匹配注释及Swagger注解，将类字段的描述或方法入参字段的描述填充到JavaDoc中
- 增加JavaDoc、Swagger注解、Protostuff注解的删除功能
- 优化右键菜单的展示形式

## [0.9.2] - 2023-07-31

### Added

- If you only need to manipulate Swagger annotations and not Protostuff annotations , and vice versa, don't worry, you
  can switch via the "settings -> tools -> Bitkylin Universal Generate" page.
- Add multi-language support, now support English and Chinese, you can configure the language by "settings".
- Right-click in a different location (class, field, method, or elsewhere) to generate a specific personalized
  right-click menu.

### 添加

- 如果你只需要操作Swagger注解而不需要操作Protostuff注解，反之亦然，不用担心，你可以通过 "settings -> tools -> Bitkylin
  Universal Generate" 页面进行切换。
- 添加多语言支持，现在支持英文和中文，可以通过「settings」配置语言。
- 在不同的位置（类、字段、方法或其他地方）点击右键，生成特定的个性化右键菜单。

## [0.8.0] - 2023-07-24

### Added

- Acting on Controller class or POJO class, you can easily generate Protostuff annotation "@Tag" with one click, and can
  directly convert JavaDoc to Swagger2.0 annotations. In turn, you can easily convert Swagger2.0 annotations to JavaDoc
  with a single click.
- More convenient features will be added later, so stay tuned!

### 添加

- 作用于Controller类或POJO类，你可以很方便的一键生成Protostuff注解「@Tag」，并且可以直接将JavaDoc转换为Swagger2.0注解。反过来，你也可以方便的一键将Swagger2.0注解转换为JavaDoc。
- 后续会添加更多方便的功能，敬请期待吧！