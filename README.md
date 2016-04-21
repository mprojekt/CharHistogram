# Histogram znaków (Char Histogram)
## Proste rozwiązanie.

### 1. O co chodzi?

Prezentowany kod zlicza ilość wystąpień znaków w napisie (stringu).

### 2. Właściwości

*  Kod zlicza wszystkie znaki możliwe do wprowadzenia z klawiatury.
*  Znaki białe (tabulator, przejście do nowej lini itp) *poza spacją* nie są brane pod uwagę!
*  kod napisany w Java 8 - użyty stream i wyrażenia lambda.
	
### 3. Przykład
Wynikiem dla następującego tekstu:
```
Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. 
Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
```
będzie:
```
 26 | 12 | 2 | 1 | 7 | 1 | 6 | 18 | 4 | 15 | 1 | 6 | 2 | 10 | 12 | 4 | 12 | 4 | 1 | 8 | 15 | 13 | 11
----|----|---|---|---|---|---|----|---|----|---|---|---|----|----|---|----|---|---|---|----|----|----
    |  a | A | b | c | C | d |  e | g |  i | L | l | , |  m |  n | . |  o | p | q | r |  s |  t |  u
```