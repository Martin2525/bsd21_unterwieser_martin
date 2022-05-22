# Task 5 for Config-Managament
### Importing logging softwar Log4j

 ##### Answering the following 3 questions:

 ##### 1. Warum werden Logging Bibliotheken verwendet?
 ##### 2. Welche Loglevel gibt es in Log4J und was hat es damit auf sich?
 ##### 3. Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?


  ##### 1)
  Sammeln von Meldungen und Warnungen im Code und richtigerer Kategoriesierungen dieser. Nachrichten werden über Logger
  in Loggingsystem weitergeleitet und danach in verschieden Loglevel eingeteilt.


  ##### 2)
  Es gibt folgende Standart level:

  ALL   Level : Alle Meldungen werden ungefiltert ausgegeben
  DEBUG Level : allgemeines Debugging
  INFO  Level : allgemeine Informationen (Programm gestartet, Programm beendet)
  WARN  Level : Auftreten einer gefährlichen Situation
  ERROR Level : Auftreten von Fehlern aber Porgramm läuft weiter.
  FATAL Level : Kritischer Fehler und Programm kann nicht weiter laufen.
  OFF	Level : Logging wird abgebrochen
  TRACE Level : ausführlicheres Debugging

 ##### 3)
 Erstellen eigener Levels mit eigenen Priotiäten.
 Anpassung von geloggten Daten nach eigener Sortierung oder Aufname.
 
 Es gibt drei Arten, Log4j zu konfigurieren:
 1) Properties-datei
 2) XML-Datei 
 3) Programmcode



