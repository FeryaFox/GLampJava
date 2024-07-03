# Доки

## Создание объекта лампы

Пример:
```java
GLamp.Builder builder = new GLamp.Builder();
builder.setGroupId(1); // группа лампы
builder.setKey("GL"); // ключ лампы
builder.setLocalIp("192.168.31.197"); // локальный адрес
GLamp lamp = builder.build();
```


### setKey

Задает ключ, который был задан при прошивке GyverLamp2

```java
builder.setKey("Key");
```


### setGroupId

Задает id группы ламп.

```java
builder.setGroupId(1);
```

### setLocalIp

Устанавливает с какого ip адреса будут производиться запросы. Нужен, если у устройства несколько сетевых интерфейсов. Если не задать, то будет выбран автоматически

```java
builder.setLocalIp("192.168.1.1");
```

### setLampIp

Устанавливает ip адрес лампы. Если не указать, то будет использоваться широковещательный адрес, полученный от локального ip.


> [!WARNING] 
> Рекомендуется не использовать setLampIp, тк в большинстве случаев все будет работать из коробки.


```java
builder.setLocalIp("192.168.1.1");
```

### setPort

Устанавливает порт на котором работает GyverLamp 2. Если не указать, то будет сгенерирован автоматически (код для генерации находится в GLampUtils.genPort принимает key и groupId)

> [!WARNING] 
> Рекомендуется не использовать setPort, тк в большинстве случаев нет в этом необходимости. Порт генерируется по ключу и по номеру группы.

```java
builder.setPort("123");
```

### setNetmask

Устанавливает маску сети. Если не указать, то будет использована "255.255.255.0"

> [!WARNING] 
> Рекомендуется не использовать setNetmask, тк в большинстве случаев все будет работать из коробки.

```java
builder.setNetmask("255.255.255.0");
```

## Управление лампой

### turnOff

Выключить лампу

```java
lamp.turnOff();
```

### turnOn

Включить лампу

```java
lamp.turnOn();
```

### minBrightness

Установка минимальной яркости

```java
lamp.minBrightness();
```

### maxBrightness

Установка максимальной яркости

```java
lamp.maxBrightness();
```

### prevMode

Предыдущий режим

```java
lamp.prevMode();
```

### nextMode

Следующий режим

```java
lamp.nextMode();
```

### setMode

Устанавливает конкретный режим. Принимает число - номер режима

```java
lamp.setMode(1);
```

### setWifiMode

Установка режима Wi-Fi. 0 - Точка доступа, 1 - Подключение к роутеру

```java
lamp.setWifiMode(1);
```

### changeRole

Установка роли. 0 - Slave, 1 - Master

```java
lamp.changeRole(1);
```

### changeGroup

Установка номера группы принимает число - номер группы.

```java
lamp.changeGroup(3);
```

### setWifi

Задает имя и пароль сети, к которой подключится лампа. В имени и пароле не должно быть ,

```java
lamp.setWifi("Test SSID", "Test Password");
```

### restart

Перезагрузить лампу

```java
lamp.restart();
```

### firmwareUpdate

Обновление прошивки

```java
lamp.firmwareUpdate();
```

### turnOffTimer

Таймер выключения. Принимает задержку в минутах от 0 до 255.

```java
lamp.turnOffTimer(5);
```

## Обновление настроек

Пример:

```java
GLampSettings.Builder settings_builder = new GLampSettings.Builder();  
settings_builder.setBrightness(100);  
settings_builder.setHeight(16);  
settings_builder.setWidth(16);  
GLampSettings settings = settings_builder.build();  
lamp.updateSettings(settings);
```

Рассмотрим все поля GLampSettings.


> [!INFO]
> Все методы, которые принимаю числа, принимают или целое число или строку.
> 
> Все поля необязательные, если не указать, то будут приняты значения по умолчанию.
> 
> Если неверно задать значения поля, то будут вызвано исключение `GLampParamsException`

### setBrightness

Устанавливает яркость. По умолчанию 100. Принимает значения от 0 до 255.
```java
settings_builder.setBrightness(100);
```

### setAdc

Устанавливает значения АЦП. По умолчанию 1. Может быть 1 (выкл) или 2 (яркость) или 3 (музыка) или 4 (оба).

```java
settings_builder.setAdc(2);
```

### setMinBrightness

Устанавливает минимальную яркость для АЦП. По умолчанию 0. Принимает значения от 0 до 255.

```java
settings_builder.setMinBrightness(10);
```

### setMaxBrightness

Устанавливает максимальную яркость для АЦП. По умолчанию 255. Принимает значения от 0 до 255.

```java
settings_builder.setMaxBrightness(200);
```

### setModesChange

Устанавливает ручную или автоматическую смену режима. По умолчанию 0. Принимает 0 (ручная) или 1 (автоматическая).

```java
settings_builder.setModesChange(1);
```

### setRandomOrderModes

Использовать ли случайный порядок режимов. По умолчанию 0. Принимает 0 (выкл) или 1 (вкл)

```java
settings_builder.setRandomOrderModes(1);
```

### setShiftPeriod 

Период смены режимов. По умолчанию 1. Может быть 1,5,10,15,25,30,40,50,60.

```java
settings_builder.setShiftPeriod(10);
```

### setStripType

Тип лампы. По умолчанию 2. Принимает 1 лента, 2 зигзаг, 3 спираль

```java
settings_builder.setStripType(2);
```

### setMaximalCurrent

Устанавливает максимальный ток. По умолчанию 15. Принимает мА / 100

```java
setting_builder.setMaximalCurrent(20);
```

### setWorkHoursFrom

Часы работы от. По умолчанию 0. Принимает от 0 до 23.

```java
setting_builder.setWorkHoursFrom(12);
```

### setWorkHoursTo

Часы работы до. По умолчанию 0. Принимает от 0 до 23.

```java
setting_builder.setWorkHoursTo(20);
```


### setMatrixOrientation

Установка ориентации матрицы.

```java
setting_builder.setMatrixOrientation(6);
```

### setHeight

Установка длины матрицы. По умолчанию 16. Может быть от 0 до 65,535

```java
setting_builder.setHeight(16);
```

### setWidth

Установка ширины матрицы. По умолчанию 16. Может быть от 0 до 65,535

```java
setting_builder.setWidth(16);
```

### setGmt

Устанавливает часовой пояс. По умолчанию 16. Принимает число + 13

```java
setting_builder.setGmt(20);
```

### setCityId

Устанавливает id города. По умолчанию 524901. Принимает от 0 до 4,294,967,295

```java
setting_builder.setCityId(524901);
```

### setMqttState

Устанавливает включен или нет mqtt. По умолчанию 0. Принимает 0 (выкл) или 1 (вкл)


> [!WARNING]
> На данный момент в официальной прошивке не реализован mqtt. Эти значения просто заглушки.


```java
setting_builder.setMqttState(1);
```

### setMqttId

Устанавливает mqtt id. По умолчанию alexLamp123. Принимает текст.

```java
setting_builder.setMqttId("alexLamp123");
```

### setMqttHost

Устанавливает хост mqtt. По умолчанию broker.mqttdashboard.com. Принимает текст

```java
setting_builder.setMqttHost("example.com");
```

### setMqttPort

Устанавливает порт mqtt. По умполчанию 1883. Принимает положительное целое число.

```java
setting_builder.setMqttPort(45);
```

### setMqttLogin

Устанавливает логин mqtt. По умолчанию gyver. Принимает текст.

```java
setting_builder.setMqttLogin("login");
```

### setMqttPass

Устанавливает пароль mqtt. По умолчанию 123456. Принимает текст.

```java
setting_builder.setMqttPass("pass");
```

Продолжение следует...