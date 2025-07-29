## Izveštaj statičke analize

**LOC (Lines of Code):** 151

---

**Zapažanja:**

### Calculator.java

- linija 1 – Nedostaje Javadoc komentar za klasu `Calculator`.
- linija 8 – Metoda `ToString()` nije u skladu sa Java konvencijom imena (trebalo bi `toString()`).
- linija 18 – Potencijalni `StringIndexOutOfBoundsException` ako je `expression` prazan.
- linije 25–29 – Parsiranje izraza bi bilo robusnije uz `Pattern`/`Matcher`.
- linije 33–43 – Nepotpun kontekst za `Infinity` i `-Infinity`, fali komentar.
- linija 45 – Vraća `"ERROR"` kao string; bolji pristup je koristiti izuzetke ili `Optional`.
- linija 50 – Metoda `Calculate()` koristi rekurziju, može izazvati `StackOverflowError` za velike izraze.
- linije 65+ – Dupliran kod za svaku operaciju u `Calculate()` – refaktorisati.
- linija 94 – Nejasno korišćenje `result +=`, iako može biti samo `result =`.
- linije 100+ – Deljenje sa nulom može izazvati `Infinity`; validacija nije svuda prisutna.

### Start.java

- linija 1 – `Scanner` se kreira u svakoj iteraciji – preporučuje se da se kreira izvan petlje.
- linija 4 – Varijabla `Expression` bi trebalo da se nazove `expression`, po Java konvenciji.
- linija 7 – `scanIn` varijabla je nepotrebno deklarisana van mesta upotrebe.
- linija 10 – `"exit".equals(Expression)` je bezbednije od `Expression.equals("exit")`.
- linija 15 – `System.out.println()` nije preporučen za ozbiljniju aplikaciju – razmisliti o logovanju.
- linija 1–24 – Nedostaje Javadoc za klasu i `main()` metodu.
