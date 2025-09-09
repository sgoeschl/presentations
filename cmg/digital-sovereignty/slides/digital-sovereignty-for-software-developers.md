theme: Merriweather,8

# Digitale Souveränität für Europäische Softwareentwickler

#### Siegfried GÖSCHL

#### ASCIIFISH

--- 

## Siegfried GÖSCHL

[.column]

* Java Backend Developer & Solution Architect
* Open Source Evangelist
* Organisator bei Java Meetup Vienna & DevFest Vienna

[.column]
![inline](./images/portrait.jpg)

---

## Digital Souveränität für Softwareentwickler?!

---

## Unabhängigkeit von teuren proprietären Tools und US-Konzernen durch strategische Technologieentscheidungen

---

![](./images/digitial-dependencies-everywhere.jpg)

---

## Software Developer Onboarding

* Linux und Macs werden nicht unterstützt
* Du brauchst Outlook wegen Exchange Server
* Das Solution Design wird in Word geschrieben
* Und Präsentationen bitte in Powerpoint
* Dokumentation ist am Sharepoint oder Confluence

^ - Fiktives (oder nicht so fiktives) Onboarding eines Software Entwicklers

---

## Software Developer Onboarding

* Tasks & Bugs werden in JIRA verwaltet
* Data Ware House (DWH) verwendet Oracle 19c
* PROD läuft auf dem AWS Data Center in Frankfurt

---

> Wer etwas will, findet Wege. Wer etwas nicht will, findet Gründe.
> -- Götz Werner, Gründer dm Drogerie Markt

---

## Programmiersprachen

|        **Sprache**        |                          **Abhängigkeit**                           |                                        **Vorteile für Souveränität**                                         |                            **Nachteile / Verzicht**                             |
|:-------------------------:|:-------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------:|
|         **Java**          |          Oracle (Historisch), Eclipse Foundation, OpenJDK           | Sehr viele Open-Source-Implementierungen (OpenJDK, Eclipse Temurin, Azul, Adoptium), große Community, stabil |          Teilweise Oracle-Politik bzgl. Lizenzen, „Enterprise-lastig“           |
|        **Python**         |              Community-getrieben, keine einzelne Firma              |  Enorm große Community, viele freie Tools, Plattformunabhängig, starker Fokus auf Wissenschaft, KI, DevOps   | Teilweise Performance (im Vergleich zu C/Go/Java), viele inkompatible Libraries |
|      **Go (Golang)**      |               Google (ursprünglich), aber Open-Source               |             Einfach, modern, hervorragende Performance, sehr gutes Ökosystem, viele freie Tools              |                Google hat starken Einfluss (Governance, Roadmap)                |
|         **Rust**          |              Community & Rust Foundation (unabhängig)               |                 Sehr moderne Sprache, performant, sicher, Open-Source, wachsendes Ökosystem                  |            Noch weniger Enterprise-Tooling, Einarbeitung schwieriger            |
|         **C/C++**         |      ISO-Standard, Compiler vielfach Open-Source (GCC, Clang)       |                        Sehr souverän, extrem viele freie Werkzeuge, Industriestandard                        |                      Komplexe Toolchains, steile Lernkurve                      |
| **JavaScript/TypeScript** | Starker Einfluss von Microsoft (TypeScript) und Google (Node.js/V8) |                  Sehr große Entwicklerbasis, viele freie Frameworks, Browser als Plattform                   |         Abhängigkeit von Google (V8) und Microsoft (TS, GitHub/VS Code)         |
|        **C#/.NET**        |          Trotz .NET Core Öffnung starke Microsoft-Bindung           |                                   Große Entwicklerbasis, freie Frameworks                                    |                        Starke Abhängigkeit von Microsoft                        |

---

## Programmiersprachen

* Oft nicht sinnvoll / möglich auf eine andere Sprache zu migrieren
  * Umstellen von Legacy Code?!
  * Umschulen der Mitarbeiter?
  * Kommerzielles Umfeld erlaubt keine anderen Möglichkeiten

---

## Infrastruktur

* Müssen wir JIRA & Confluence verwenden? 
  * Atlassian hat mehrmals [die Preise stark erhöht](https://community.atlassian.com/forums/Jira-questions/Massive-Price-Increase-for-Jira-Cloud-Enterprise-and-Apps/qaq-p/2969785)
  * Ist eine Ticketsysten wirklich "Rocket Science"?
  * Wikipedia verwendet [MediaWiki](https://www.mediawiki.org/wiki/MediaWiki)
* Technische Dokumentation mit Microsoft?! 
  * [Markdown](https://www.markdownguide.org) und [AsciiDoc](https://asciidoc.org) eignen sich besser
  * Lassen sich direkt als Text versionieren 

^ - https://community.atlassian.com/forums/Jira-questions/Massive-Price-Increase-for-Jira-Cloud-Enterprise-and-Apps/qaq-p/2969785

--- 

## Datenbanken

* Oracle bietet Oracle Database and MySQL an
* MariaDB und PostgreSQL als Open Source Alternativen
  * Laufewn auf einer Vielzahl von Umgebungen und Cloudanbietern
  * Meistens wird über eine Library auf die Datenbank zugegriffen - vereinfacht die Migration

---
![](./images/questions-and-answers.jpg)

