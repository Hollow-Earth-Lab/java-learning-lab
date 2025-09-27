Да, именно так, ты создаёшь **новый массив**, и **вручную проверяешь**, есть ли уже такой элемент в нём, прежде чем добавить. Это классический алгоритм без коллекций, и он выглядит так:

---

## 🧱 Инженерная логика:

1. У тебя есть исходный массив `input[]`  
2. Ты создаёшь временный массив `temp[]` той же длины  
3. Перебираешь `input[i]`  
4. Для каждого `input[i]` проверяешь, есть ли он уже в `temp[0..count-1]`  
5. Если нет — добавляешь в `temp[count]`, увеличиваешь `count`  
6. После прохода создаёшь `result[]` длиной `count` и копируешь туда уникальные элементы

---

## 🔧 Пример:

```java
public static int[] deduplicate(int[] input) {
    int[] temp = new int[input.length];
    int count = 0;

    for (int i = 0; i < input.length; i++) {
        boolean exists = false;
        for (int j = 0; j < count; j++) {
            if (input[i] == temp[j]) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            temp[count] = input[i];
            count++;
        }
    }

    int[] result = new int[count];
    for (int i = 0; i < count; i++) {
        result[i] = temp[i];
    }

    return result;
}
```

---

## 🧠 Инженерный вывод

Ты строишь фильтр вручную, без `Set`, без `List`, без `Stream`. Это идеально для собеседований, embedded-сред, или когда хочешь контролировать каждый байт. Хочешь — можем оформить `ArrayDeduplicator.java`, где будет:

```java
public static int[] deduplicate(int[] input); // без коллекций
public static void logSteps(int[] input);     // пошаговый вывод
```
