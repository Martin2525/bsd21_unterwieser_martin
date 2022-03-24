# CalculatorArg und CalculatorSys ReadME
### Einführung

Dies ist eine simple Erklärung zur Aufgabenstellung und Durchführung der ersten Übung von Porgrammieren II in diesen Semester.
Das Projekt war aufgeteilt in folgende 2 Java-Klassen:

  1. **CalculatorArg**
  2. **CalculatorSys**

Aufgaben von beiden war es einen simplen "+\-/*" Rechner darzustellen, einmal mit Eingaben mithilfe Java.scanner (**CalculatorSys**tem) in der Konsole und einmal über  Java-Kommandozeilenparameter (**CalculatorArg**uments).

### Installierungshilfe
Die beiden Porgamme zu intstallieren ist extrem leicht, benutzte sie wie jede andere Java-Klasse. 
Sie sind beide voneinander unabhängig.
Falls Sie nicht wissen, wie sie eine Java-Klasse starten empfehle ich folgenden Link der Sie zu einer sehr hilfreichen Webseite dazu führt.
[**Bitte hier klicken**](https://letmegooglethat.com/?q=Wie+startet+man+eine+Java+Klasse)

### Erklärung des Programmes
Das Programm selbst ist simple und ich würde eine Klasse nach der anderen erklären.

**CalculatorArg** fangt mit einem trycatch Befehl an der die drei Parameter (Variable1,Operator,Variable 2) aus der Kommandozeile herausnimmt und die Variablen in Doubles und den Operator in char verwandelt. 
Falls hier Fehler auftreten (nicht genug Angaben in Kommandozeile, falsche Angaben, keine Angaben etc.) wird sofort eine Error Message gegeben und das Programm geschlossen.
Danach wird anhand eines Switch Befehles mithilfe des Operator entschieden, welchen Rechenweg man benutzt und darauf erhält man das Ergebniss in der Konsole in folgenden Format:
`Variable1 Operator Variable2 = Ergebnis`

**CalculatorSys** fangt mit 2 Methoden an die dazu dienen Doubles und Charactere einzulesen. Dies passiert hauptsächlich über folgende Befehle: 
1. `Double.parseDouble(scanner.nextLine())`
2. `String=scanner.nextLine();String = placeholder.charAt(0);`

Doubles werden für Variablen benutzt und Character für dern Operator. Dann ist es ähnlich, wie bei der anderen Klasse, wo durch ein Switch Kommand der Rechenbefehl durch den Operator ausgelöst wird.

### Außnahmen und Systemfehler außerhalb des Beispiels

Zusätzlich zu den gegebenen Außnahmen haben ich noch eine weitere Ausßname hinzugefügt: "Error -Divison through 0". Sobald der Operator "/" ist und Variable2 "0" ist, wird dieser Fehler ausgegeben.

### Kontakt

Für jegliche Fragen zu diesen Programm melden sie sich bitte an meineemailadresse@gmail.com.

![Error Code](https://techvig.net/wp-content/uploads/2020/11/Solution-pii_email_9c55590039c2c629ec55-Error-Code.jpg)







