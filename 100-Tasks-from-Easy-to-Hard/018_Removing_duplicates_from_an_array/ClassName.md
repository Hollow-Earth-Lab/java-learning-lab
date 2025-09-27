Вот инженерно точные варианты названия Java-класса для задачи «Удаление дубликатов из массива»:

---

## 🔧 Функциональные и прямолинейные:
- `DuplicateRemover`
- `ArrayDeduplicator`
- `UniqueFilter`
- `DistinctExtractor`

---

## 🧱 Архитектурные и модульные:
- `ArraySanitizer`
- `DataNormalizer`
- `CleanArrayModule`
- `SetifyEngine` (если используешь `Set` для удаления)

---

## 🧠 С намёком на расширение:
- `CollectionCleaner` — если хочешь обрабатывать `List`, `Set`, `Map`
- `DataPreprocessor` — если это часть пайплайна
- `ArrayUtils` — если планируешь добавить другие утилиты

---

Хочешь — можем оформить `DuplicateRemover.java`, где будут:

```java
public static int[] removeDuplicates(int[] input);
public static void logResult(int[] original, int[] cleaned);
public static boolean hasDuplicates(int[] array);
```
