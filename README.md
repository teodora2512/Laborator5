# Laborator 5 — Programare Java

## 📚 Tema Laboratorului
Acest laborator cuprinde mai multe exerciții pentru consolidarea conceptelor de programare orientată pe obiecte în Java, colecții, serializare JSON, expresii lambda și Stream API. Proiectul este împărțit în mai multe pachete și include clase pentru manipularea de date, calcul numeric și gestionarea mobilierului.

---

## 🗂️ Structura proiectului

```
Laborator5/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── exemplul1/
│ │ │ │ ├── MainApp.java
│ │ │ │ └── Persoana.java
│ │ │ ├── exercitiul2/
│ │ │ │ ├── MainApp.java
│ │ │ │ └── PerecheNumere.java
│ │ │ ├── exemplul2/
│ │ │ │ └── Calculator.java
│ │ │ └── exercitiul3/
│ │ │ ├── MainApp.java
│ │ │ ├── Mobilier.java
│ │ │ ├── Placa.java
│ │ │ └── Orientare.java
│ │ └── resources/
│ │ ├── persoane.json
│ │ ├── perechi.json
│ │ └── mobilier.json
└── test/
└── java/
├── TestePerechi.java
└── TesteCalculator.java

```

---

## 📌 Pachet `exemplul1` — Gestionarea Persoanelor

### Clase
- **Persoana.java** — modelează o persoană cu nume și vârstă.
- **MainApp.java** — gestionează citirea și scrierea persoanelor în JSON.

### Funcționalități
- Citirea unei liste de persoane din fișier JSON (`citire()`)
- Adăugarea unei persoane în listă
- Scrierea listei înapoi în fișier JSON (`scriere()`)

### Exemple JSON
```
json
[
  {"nume":"Ana","varsta":25},
  {"nume":"Ion","varsta":40}
]
```

## 📌 Pachet exemplul2 — Calculator simplu
### Clase
- **Calculator.java**— realizează operații simple (suma a două numere)
- **TesteCalculator.java** — teste unitare cu JUnit
- Exemple de teste
```
Calculator c = new Calculator(4, 5);
assertEquals(9, c.suma());

```
## 📌 Pachet exercitiul2 — Perechi de numere
### Clase
- **C erecheNumere.java**— gestionează o pereche de numere și metode precum:
- cmmmc() — calculează CMMMC
- suntConsecutiveFibonacci() — verifică dacă sunt consecutive Fibonacci
- auSumaCifEgala() — verifică dacă suma cifrelor e egală
- auAcelasiNrCifrePare() — verifică dacă au același număr de cifre pare
- MainApp.java — citire și scriere JSON a perechilor și afișare cu lambda/Stream API
- TestePerechi.java — teste unitare JUnit pentru fiecare metodă
### Funcționalități
- Crearea unei liste de perechi
- Scrierea listei în perechi.json
- Citirea listei și procesarea datelor cu lambda:
- afișare
- filtrare
- sortare
- Exemple rulare în consolă
```
Perechi citite din fisier:
(12, 21)
(11, 10)
(3, 5)

Perechi unde primul > al doilea:
(11, 10)

Sortate după primul număr:
(3, 5)
(11, 10)
(12, 21)

```
## 📌 Pachet exercitiul3 — Gestionarea mobilierului
### Clase
- **Mobilier.java**— modelează o piesă de mobilier formată din plăci
- **Placa.java**— reprezintă o placă de PAL cu dimensiuni, orientare și muchii
- **Orientare.java** — enumerare pentru orientarea fibrei plăcii
- **MainApp.java** — afișează lista pieselor și permite căutarea unei piese pentru detalii
### Funcționalități
- Citire mobilă din JSON (mobilier.json)
- Calcul aria totală a mobilierului și numărul de coli necesare
- Interacțiune cu utilizatorul (introducere nume piesă pentru detalii)
- Afișare detalii despre fiecare placă și calcul estimativ
### 🧪 Testare
- TesteCalculator.java — verifică corectitudinea metodei suma()
- TestePerechi.java — verifică logica metodelor din PerecheNumere
### 🚀 Concepte aplicate
- Colecții Java (List, ArrayList)
- Serializare / Deserializare JSON (biblioteca Jackson)
- Lambda și Stream API
- Testare unitară cu JUnit
- Programare orientată pe obiecte (OOP)
- Modularizarea proiectului pe pachete

## 👩‍💻 Autor
**Teodora Oțelariu**  
Laborator Java – Anul III
EOF