[![](https://jitpack.io/v/FeryaFox/GLampJava.svg)](https://jitpack.io/#FeryaFox/GLampJava)

# GyverLamp 2 
Библиотека для управления GyverLamp 2 на Java. 

Полная реализация управления GyverLamp 2.

Особенность библиотеки заключается в поддержке синхронизации (получения настроек с GyverLamp 2 по сети).

## Синхронизация

Для её работы требуется установки модифицированной прошивки https://github.com/FeryaFox/GyverLamp2Sync

При отсустствии необходимости в синхронизации, то библиотека полностью совместима с оригинальной прошивкой. 

## Установка 

### Gradle

Добавьте JitPack репозиторий в проект.

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

Добавьте зависимость в проект.

```gradle
dependencies {
        implementation 'com.github.FeryaFox:GLampJava:1.0.8'
}
```

### Maven

Добавьте JitPack репозиторий в проект.

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Добавьте зависимость в проект.

```xml
<dependency>
    <groupId>com.github.FeryaFox</groupId>
    <artifactId>GLampJava</artifactId>
    <version>1.0.8</version>
</dependency>
```

## Примеры

Создание объекта лампы.

```java
GLamp.Builder builder = new GLamp.Builder();
builder.setGroupId(1); // группа лампы
builder.setKey("GL"); // ключ лампы
builder.setLocalIp("192.168.31.197"); // локальный адрес
GLamp lamp = builder.build();
```

Включение лампы

```java
lamp.turnOn();
```

Получения настроек с лампы

```java
GLampSettings settings = lamp.syncSettings();
```

## Документация

Читать туть [[DOCS]]
Немного пока не готово... скоро исправлюсь)

## Благодарности

Огромная благодарность https://github.com/KirillMonster/GyverLamp2 за идею проекта, пример реализации. Можно назвать этот проект - порт вашей прекрасно библиотеки на Java)
