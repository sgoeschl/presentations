theme: Merriweather,8

![fit](images/title.jpg)

---

# Digitale Souveränität

## Für Europäische Softwareentwickler

### Siegfried GÖSCHL

#### ASCIIFISH GmbH
--- 

## Siegfried GÖSCHL

[.column]

* Java Backend Developer
* Open Source Evangelist
* Mitgründer der **Java User Group Austria** in 2001
* Hilft beim **Java Meetup Vienna** & **DevFest Vienna**

[.column]
![](./images/portrait.jpg)

---

## Was Ist Digitale Souveränität für Softwareentwickler?!

---

## Unabhängigkeit von teuren proprietären Tools und/oder Konzernen durch strategische Technologieentscheidungen

---

![fit autoplay loop](./images/developer-onboarding.mp4)

---

## Fikitives Developer Onboarding

* Linux und Macs werden nicht unterstützt - ist Company Policy
* Es kann nur Outlook sein - wegen Exchange Server
* Microsoft Word & Powerpoint für das tägliche Arbeiten
* Technische Dokumente in Confluence und Sharepoint

---

## Fikitives Developer Onboarding

* Bug Tracking in JIRA
* Open Source Programmierung vertraglich ausgeschlossen
* Firmenlizenz für Oracle Datenbanken
* Produktion wird von On-Prem auf Google Cloud migriert

---

![](./images/digitial-dependencies-everywhere.jpg)

---

![fit](./images/license-renewal.jpg)

---

![inline](images/forbes-01.jpg)

---

![inline](images/computer-woche-01.jpg)

---

## Und Jetzt?!

--- 

> Wer etwas will, findet Wege. Wer etwas nicht will, findet Gründe.
> -- Götz Werner, Gründer dm Drogerie Markt

---

![inline](images/bundesheer-01.jpg)

---

![inline](images/bundesheer-02.jpg)

---

## Bundesheer Migration

* In 2020 war klar, daß Microsoft Office in die Cloud wandert
* In 2023 wurde deutsches Unternehmen mit Support und externer Entwicklung beauftragt
* Es wurden 16.000 Mitarbeiter auf LibreOffice umgeschult
* Änderungen / Erweiterungen gehen zurück an LibreOffice
* LibreOffice wird von einer Stiftung betrieben - [The Document Foundation](https://www.documentfoundation.org)

^ 5 Mannjahre an Entwicklung contributed
The Document Foundation hat den Sitz in Berlin

---

## Strategien zur Verbesserung der digitalen Souveränität in der Softwareentwicklung

* Priorisierung von Open Source
* Reduktion technologischer Abhängigkeiten
* Interoperabilität & Standards
* Eigene Infrastruktur & Datenkontrolle

---

## Priorisierung Von Open Source

* Einsatz freier Entwicklungsumgebungen & Tools
* Freie Datenbanken (PostgreSQL, MariaDB) statt kommerzieller Varianten (Oracle, MSSQL)
* Verwendung von Open Source Frameworks (Spring Boot, Quarkus, Django, Angular, React)
* Prüfung der Lizenz bei Verwendung von Open Source notwendig

^ Open Source Frameworks erleichtern die Verwendung anderer Open Source Technologien

---

## Reduktion Technologischer Abhängigkeiten


* Minimierung von Vendor Lock-in: offene Standards (z. B. OpenAPI, SQL, OAuth) statt proprietärer Technologien
* Cloud-Strategie prüfen: Multi-Cloud oder Hybrid-Ansätze statt nur AWS, Azure oder GCP
* Einsatz von Container (Docker, Podman) und Orchestrierung (Kubernetes) in der Cloud

^ Multi-Cloud oder Hybrid-Ansätze ermöglichen Verhandlungsoptionen

---

## Eigene Infrastruktur & Datenkontrolle

* Verwendung offener Datenformate (XML, Markdown, ODT, EML)
* LibreOffice & NextCloud statt Microsoft
* Self-Hosting wichtiger Systeme (z. B. Git, CI/CD, Issue-Tracker) mit Tools wie GitLab CE, Gitea, Jenkins, SonarQube
* Datenhaltung bevorzugt auf eigener Hardware oder in souveränen europäischen Clouds

---

## Open Source Lizenzen

| Aspekt                       | Permissive Lizenz                                                            | Copyleft Lizenz                                                                         |
|------------------------------|------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|
| **Weiterverwendung**         | Quellcode darf in **proprietäre (geschlossene)** Software integriert werden. | Quellcode darf nur in **freie Software** integriert werden, die ebenfalls offen bleibt. |
| **Pflichten bei Weitergabe** | Nur Urheberrechtshinweis und Lizenztext beibehalten.                         | Modifizierte Versionen müssen **unter derselben Lizenz** veröffentlicht werden.         |
| **Kommerzielle Nutzung**     | Uneingeschränkt erlaubt, auch in geschlossenen Produkten.                    | Erlaubt, aber **Quellcode muss offengelegt** werden, wenn verteilt.                     |
| **Beispiele**                | MIT, BSD, Apache 2.0                                                         | GPL, LGPL, MPL, EPL                                                                     |
| **Zielsetzung**              | Maximale Verbreitung und Flexibilität.                                       | Sicherstellung, dass Software **immer frei bleibt**.                                    |

---

| Lizenz                                 | Typ (Copyleft?)         | Kurzbeschreibung                                                                                    | **Vorteile**                                                               | Nachteile                                                         | Typische Einsatzszenarien                                                          |
|----------------------------------------|-------------------------|-----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|-------------------------------------------------------------------|------------------------------------------------------------------------------------|
| **MIT License**                        | Nein (permissiv)        | Sehr einfach, erlaubt uneingeschränkte Nutzung und Modifikation bei Erhalt des Copyright-Hinweises. | - Extrem einfach<br>- Kompatibel mit anderen Lizenzen<br>- Weit verbreitet | - Keine Pflicht zur Offenlegung<br>- Proprietäre Nutzung erlaubt  | 🔹 JavaScript-/Python-Bibliotheken<br>🔹 Startups & akademische Projekte           |
| **Apache License 2.0**                 | Nein (permissiv)        | Enthält Patentklauseln und ist für Unternehmen rechtlich sicherer als MIT.                          | - Patent-Schutz<br>- Unternehmensfreundlich<br>- Rechtlich klar            | - Etwas längerer Lizenztext                                       | 🔹 Cloud-/Enterprise-Projekte<br>🔹 Firmen-Open-Source (Google, Apache Foundation) |
| **BSD 3-Clause**                       | Nein (permissiv)        | Ähnlich MIT, aber mit zusätzlicher Namensverwendungsbeschränkung.                                   | - Minimaler Verwaltungsaufwand<br>- Kommerzfreundlich                      | - Kein Schutz vor proprietärer Nutzung                            | 🔹 Systemnahe Software (z. B. FreeBSD)<br>🔹 Embedded & Netzwerktools              |
| **GPLv3 (GNU General Public License)** | Ja (starkes Copyleft)   | Erzwingt Offenlegung und Weitergabe unter gleichen Bedingungen.                                     | - Garantiert Offenheit<br>- Fördert Community-Kollaboration                | - Eingeschränkte Kompatibilität<br>- Für Firmen oft zu restriktiv | 🔹 Community-Projekte<br>🔹 Betriebssysteme (Linux)<br>🔹 Open-Hardware-Software   |
| **LGPLv3 (Lesser GPL)**                | Ja (schwaches Copyleft) | Offenlegungspflicht nur bei Änderungen an der Bibliothek selbst.                                    | - Gute Balance zwischen Offenheit & Nutzung<br>- Ideal für Libraries       | - Juristisch anspruchsvoll                                        | 🔹 Bibliotheken & Frameworks<br>🔹 Middleware-Komponenten                          |
| **MPL 2.0 (Mozilla Public License)**   | Ja (schwaches Copyleft) | Copyleft gilt nur auf Datei-Ebene; erlaubt proprietäre Kombinationen.                               | - Feingranulares Copyleft<br>- Rechtlich ausgewogen                        | - Weniger verbreitet                                              | 🔹 Browser-nahe Projekte (Firefox)<br>🔹 Unternehmenssoftware mit Open-Core        |
| **EPL 2.0 (Eclipse Public License)**   | Ja (schwaches Copyleft) | Unternehmensfreundlich; weit verbreitet in Java-Ökosystemen.                                        | - Klar und präzise<br>- Geeignet für Firmenkollaborationen                 | - Weniger bekannt außerhalb Eclipse                               | 🔹 Java-Ökosystem<br>🔹 Unternehmenssoftware<br>🔹 Open-Source-Plattformen         |

---

## Übersicht Open Source & kommerzielle Tools

---

### Linux Distributionen

| Distribution                        | Fokus-Bereiche                                  | Vorteile                                                                                                                                              | Nachteile                                                                                                                  |
|-------------------------------------|-------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| **Ubuntu**                          | Desktop, Server, Cloud                          | - Sehr große Community & viele Tutorials<br>- Einsteigerfreundlich<br>- Breite Softwareunterstützung<br>- LTS-Versionen mit 5 Jahren Support          | - Auf Canonical-Ökosystem ausgerichtet<br>- Teilweise konservative Paketversionen<br>- Telemetrie-Diskussionen             |
| **Debian**                          | Server, Entwickler, Minimal-Desktop             | - Sehr stabil und zuverlässig<br>- Riesige Paketquellen<br>- Freiheitsfokus (DFSG)<br>- Weit verbreitet als Server-OS                                 | - Pakete oft älter (konservativ)<br>- Weniger benutzerfreundlich <br>- Längere Release-Zyklen                              |
| **Fedora**                          | Entwickler, Desktop                             | - Sehr aktuell mit neuesten Features<br>- Community-getrieben, von Red Hat unterstützt<br>- Gute Integration moderner Technologien (Wayland, SELinux) | - Kürzerer Support-Zyklus (~13 Monate)<br>- Manchmal instabiler als Debian/Ubuntu<br>- Starker Fokus auf Red Hat-Ökosystem |
| **RHEL (Red Hat Enterprise Linux)** | Enterprise-Server, Cloud, zertifizierte Systeme | - Enterprise-Support & Zertifizierungen<br>- Sehr stabil & langzeitunterstützt<br>- Weit verbreitet im Unternehmensumfeld                             | - Kostenpflichtiger Support<br>- Starke Bindung an Red Hat-Ökosystem<br>- Weniger aktuell bei Desktop-Paketen              |

---

### Linux Distributionen

| Distribution            | Fokus-Bereiche                          | Vorteile                                                                                                                                     | Nachteile                                                                                                                     |
|-------------------------|-----------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| **CentOS Stream**       | Server, Cloud, Testumgebungen           | - Rolling-Release nah an RHEL<br>- Stabilität durch RHEL-Upstream<br>- Gut für Testumgebungen von RHEL-Deployments                           | - Nicht mehr klassisch "Enterprise-stabil" wie früher CentOS<br>- Kürzere Support-Laufzeiten<br>- Stärker an Red Hat gebunden |
| **openSUSE Leap**       | Server, Enterprise-Desktop              | - Stabil & für Unternehmen geeignet<br>- YaST als mächtiges Admin-Tool<br>- Kombination aus Community & SUSE-Enterprise                      | - Weniger verbreitet als Ubuntu/Debian<br>- Kleinere Community<br>- Leap nicht so aktuell wie Tumbleweed                      |
| **openSUSE Tumbleweed** | Entwickler, Desktop                     | - Rolling Release mit neuesten Paketen<br>- Sehr aktuell, Entwicklerfreundlich<br>- Gute Stabilität trotz Rolling-Modell                     | - Höherer Wartungsaufwand (häufige Updates)<br>- Nicht ideal für Produktionsserver<br>- Kleinere Nutzerbasis                  |
| **Arch Linux**          | Entwickler, Power-User-Desktop          | - Extrem flexibel und minimalistisch<br>- Rolling Release (immer aktuell)<br>- Riesige Community (Wiki!)<br>- Volle Kontrolle für Power-User | - Komplexe Installation<br>- Wartungsintensiv<br>- Updates können Systeme brechen<br>- Wenig geeignet für Einsteiger          |
| **Linux Mint**          | Desktop (Einsteiger, Umsteiger von Win) | - Einsteigerfreundlich (Windows-ähnliche Oberfläche)<br>- Auf Ubuntu/Debian basiert<br>- Sehr stabil<br>- Fokus auf Desktop-User             | - Weniger innovativ<br>- Abhängig von Ubuntu/Debian-Ökosystem<br>- Kleinere Entwicklerbasis                                   |

---

### Programmiersprachen

| Sprache                   | Abhängigkeit                                                        | Vorteile für Souveränität.                                                                                   | Nachteile / Verzicht                                                            |
|---------------------------|---------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------|
| **Python**                | Community-getrieben, keine einzelne Firma                           | Enorm große Community, viele freie Tools, Plattformunabhängig, starker Fokus auf Wissenschaft, KI, DevOps    | Teilweise Performance (im Vergleich zu C/Go/Java), viele inkompatible Libraries |
| **Java**                  | Oracle (Historisch), Eclipse Foundation, OpenJDK                    | Sehr viele Open-Source-Implementierungen (OpenJDK, Eclipse Temurin, Azul, Adoptium), große Community, stabil | Teilweise Oracle-Politik bzgl. Lizenzen, „Enterprise-lastig“                    |
| **C/C++**                 | ISO-Standard, Compiler vielfach Open-Source (GCC, Clang)            | Sehr souverän, extrem viele freie Werkzeuge, Industriestandard                                               | Komplexe Toolchains, steile Lernkurve                                           |
| **Go (Golang)**           | Google (ursprünglich), aber Open-Source                             | Einfach, modern, hervorragende Performance, sehr gutes Ökosystem, viele freie Tools                          | Google hat starken Einfluss (Governance, Roadmap)                               |
| **Rust**                  | Community & Rust Foundation (unabhängig)                            | Sehr moderne Sprache, performant, sicher, Open-Source, wachsendes Ökosystem                                  | Noch weniger Enterprise-Tooling, Einarbeitung schwieriger                       |
| **JavaScript/TypeScript** | Starker Einfluss von Microsoft (TypeScript) und Google (Node.js/V8) | Sehr große Entwicklerbasis, viele freie Frameworks, Browser als Plattform                                    | Abhängigkeit von Google (V8) und Microsoft (TS, GitHub/VS Code)                 |
| **C#/.NET**               | Trotz .NET Core Öffnung starke Microsoft-Bindung                    | Große Entwicklerbasis, freie Frameworks                                                                      | Verlust des "First Class Supports" bei Verwendung anderer Sprachen              |

^ Umstieg auf eine andere Programmiersprache oft nicht möglich / sinnvoll
- Kommerzielles Umfeld
- Umstellen von Legacy Code?!
- Umschulen der Mitarbeiter?

---

### Entwicklungsumgebungen

| Entwicklungsumgebung                | Vorteile                                                                                                                                                                   | Nachteile                                                                                                                                                                          |
|-------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Emacs**                           | - Extrem anpassbar & erweiterbar (Lisp)<br>- Vollständig Open Source<br>- Plattformunabhängig<br>- Jahrzehntelang bewährt, riesige Community                               | - Sehr steile Lernkurve<br>- Bedienung ungewohnt<br>- Mit vielen Erweiterungen ressourcenintensiv                                                                                  |
| **Vim / Neovim**                    | - Sehr leichtgewichtig & blitzschnell<br>- Läuft auf fast allen Systemen<br>- Tastaturzentrierte Bedienung<br>- Riesige Community, viele Plugins                           | - Hohe Einstiegshürde für Neulinge<br>- Weniger komfortabel als moderne IDEs<br>- Kaum integrierte Enterprise-Features                                                             |
| **VS Code (Microsoft)**             | - Kostenlos & weit verbreitet<br>- Riesiges Erweiterungs-Ökosystem<br>- Git-Integration & Debugging integriert<br>- Plattformübergreifend<br>- Benutzerfreundlich & modern | - Offizielle Builds enthalten Telemetrie<br>- Gefahr von Vendor Lock-in (Azure/GitHub)<br>- Kein vollständiger IDE-Ersatz<br>- Performance bei sehr großen Projekten eingeschränkt |
| **IntelliJ IDEA Community Edition** | - Kostenlos & Open Source<br>- Sehr benutzerfreundlich<br>- Starke Java- & Kotlin-Unterstützung<br>- Plattformübergreifend<br>- Gute Integration mit Maven/Gradle          | - Eingeschränkter Funktionsumfang (kein Spring, kein Java EE, keine erweiterten Frameworks)<br>- Weniger für Enterprise-Anwendungen geeignet                                       |

---

### Entwicklungsumgebungen

| Entwicklungsumgebung        | Vorteile                                                                                                                                                                                                           | Nachteile                                                                                                                                                                                                                |
|-----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **IntelliJ IDEA Ultimate**  | - Vollständige IDE mit allen Enterprise-Features<br>- Breite Unterstützung für Java, Kotlin, Spring, Java EE, Datenbanken, Webframeworks<br>- Sehr gute Code-Analyse & Refactoring<br>- Plattformübergreifend      | - Proprietär & kostenpflichtig<br>- Ressourcenschwer<br>- Abhängigkeit von JetBrains-Lizenzmodell                                                                                                                        |
| **Eclipse**                 | - Vollständig Open Source<br>- Riesige Community & viele Plugins<br>- Plattformübergreifend<br>- Starke Java-Integration<br>- Keine Lizenzkosten                                                                   | - Oberfläche altmodisch<br>- Performance bei großen Projekten träge<br>- Plugins teils unübersichtlich & qualitativ schwankend                                                                                           |
| **NetBeans (Apache)**       | - Vollständig Open Source<br>- Plattformübergreifend<br>- Gute Java- & PHP-Unterstützung<br>- Maven, Git & CI integriert                                                                                           | - Weniger aktiv entwickelt als Eclipse/IntelliJ<br>- Oberfläche wirkt altbacken<br>- Kleinere Community<br>- Weniger moderne Features                                                                                    |
| **Microsoft Visual Studio** | - Sehr mächtige IDE<br>- Exzellente Debugging- & Profiling-Tools<br>- Optimiert für .NET, C#, Azure, SQL Server<br>- Umfangreiche Enterprise-Features (Architektur, Tests, CI/CD)<br>- Große Community & Ökosystem | - Proprietär, keine Open-Source-Variante<br>- Hohe Lizenzkosten (außer Community Edition)<br>- Sehr ressourcenhungrig<br>- Volle Funktionalität nur unter Windows<br>- Gefahr von Vendor Lock-in mit Microsoft-Ökosystem |

---

### Datenbanken

| Datenbank                        | Typ                     | Vorteile                                                                                                                                                                                                                          | Nachteile                                                                                                                                        |
|----------------------------------|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| **Oracle Database**              | Kommerziell             | - Sehr leistungsfähig & hochskalierbar<br>- Umfassende Enterprise-Features (RAC, Data Guard, Partitionierung)<br>- Hohe Stabilität & Sicherheit<br>- Weltweit verbreitet in Großunternehmen<br>- Umfangreicher Hersteller-Support | - Sehr hohe Lizenz- und Supportkosten<br>- Komplexes Lizenzmodell<br>- Proprietär → starker Vendor Lock-in<br>- Administration komplex           |
| **Microsoft SQL Server (MSSQL)** | Kommerziell             | - Gute Integration in Microsoft-Ökosystem (Windows, Azure, PowerBI)<br>- Leistungsfähige BI- und Reporting-Features<br>- Stabil, weit verbreitet im Enterprise<br>- Gute Tools für Entwickler (SSMS, Profiler)                    | - Proprietär, Vendor Lock-in<br>- Lizenzkosten hoch (Enterprise Edition)<br>- Primär auf Windows/Linux<br>- Abhängigkeit von Microsoft-Strategie |
| **SAP HANA**                     | Kommerziell (In-Memory) | - Sehr hohe Performance durch In-Memory-Architektur<br>- Echtzeit-Analytik & OLAP/OLTP kombiniert<br>- Optimiert für SAP-ERP/BI<br>- Starke Integrationsmöglichkeiten in SAP-Produkte                                             | - Extrem teuer (Lizenzen + Hardware)<br>- Proprietär, Vendor Lock-in mit SAP<br>- Hohe Hardware-Anforderungen<br>- Eher für SAP-Kunden sinnvoll  |

---

### Datenbanken

| Datenbank                     | Typ                                | Vorteile                                                                                                                                                                                                                   | Nachteile                                                                                                                                                                                       |
|-------------------------------|------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **MySQL (Community Edition)** | Frei (Open Source, gehört Oracle)  | - Weit verbreitet, große Community<br>- Einfach zu installieren & zu administrieren<br>- Gute Performance für Webanwendungen<br>- Viele Hosting-Anbieter unterstützen MySQL nativ<br>- Kostenlos in Community Edition      | - Kommerzielle Versionen mit erweiterten Features proprietär<br>- Weniger standardkonform als PostgreSQL<br>- Eingeschränkte Enterprise-Funktionalitäten<br>- Teilweise Abhängigkeit von Oracle |
| **PostgreSQL**                | Frei (Open Source)                 | - Vollständig Open Source & kostenlos<br>- Sehr leistungsfähig, stabil & erweiterbar<br>- Starke Standardkonformität (SQL, ACID)<br>- Erweiterungen (PostGIS, TimescaleDB, FDWs)<br>- Plattformunabhängig, große Community | - Weniger „Out-of-the-box“-Enterprise-Tools als Oracle<br>- Komplexere Administration im Vergleich zu MySQL/MariaDB<br>- Kein zentraler Hersteller-Support (nur Drittanbieter)                  |
| **MariaDB**                   | Frei (Open Source, Fork von MySQL) | - Komplett Open Source<br>- Kompatibel zu MySQL (Drop-in Replacement)<br>- Flexibel durch viele Storage Engines<br>- Schnell & leichtgewichtig<br>- Plattformübergreifend                                                  | - Kleinere Community als MySQL/Postgres<br>- Weniger Enterprise-Features<br>- Weniger verbreitet im Enterprise-Sektor<br>- Für extreme Skalierung nicht so optimiert wie Oracle/PG              |

---

## Cloud Technologien

### Vermeidung Des Vendor Lock-ins

---

### Cloud VMs & Containers

| Feature                                | AWS                              | Google Cloud                           | Azure                          | Purpose / Benefit                                                            |
|----------------------------------------|----------------------------------|----------------------------------------|--------------------------------|------------------------------------------------------------------------------|
| **Kubernetes (Managed Service)**       | EKS (Elastic Kubernetes Service) | GKE (Google Kubernetes Engine)         | AKS (Azure Kubernetes Service) | Industry-standard container orchestration                                    |
| **Virtual Machines**                   | EC2                              | Compute Engine                         | Virtual Machines               | Standard compute abstraction; compatible with Terraform and other IaC tools. |
| **Container Registry (OCI Compliant)** | Amazon ECR                       | Artifact Registry / Container Registry | Azure Container Registry       | Follows OCI standard, ensuring container image portability.                  |

---

### Cloud Storage & Datenbanken

| Feature                                     | AWS                    | Google Cloud  | Azure                                       | Purpose / Benefit                                 |
|---------------------------------------------|------------------------|---------------|---------------------------------------------|---------------------------------------------------|
| **Object Storage (S3-Compatible API)**      | S3                     | Cloud Storage | Blob Storage (S3-compatible via SDKs/tools) | Widely adopted S3 API minimizes migration effort. |
| **Relational Databases (PostgreSQL/MySQL)** | RDS (PostgreSQL/MySQL) | Cloud SQL     | Azure Database for PostgreSQL/MySQL         | Open-source databases ensure data portability.    |

---

### Cloud Observability & Monitoring

| Feature                            | AWS                               | Google Cloud                            | Azure                                | Purpose / Benefit                                     |
|------------------------------------|-----------------------------------|-----------------------------------------|--------------------------------------|-------------------------------------------------------|
| **OpenTelemetry Support**          | CloudWatch supports OpenTelemetry | Cloud Operations supports OpenTelemetry | Azure Monitor supports OpenTelemetry | Unified tracing and metrics across vendors.           |
| **Prometheus/Grafana Integration** | Managed Prometheus & Grafana      | Managed Prometheus & Grafana            | Managed Prometheus & Grafana         | Portable open-source monitoring stack.                |
| **Log Export / Open APIs**         | CloudWatch Logs export            | Cloud Logging export                    | Log Analytics export                 | Export to neutral targets for cross-cloud visibility. |

---

## Personal Techstack

* MacBook Pro 
* Git für die Versionskontrolle
* Sublime (commercial) & Visual Code als Editor
* IntelliJ Ultimate als IDE (commercial)
* Backendentwicklung mit Java, Maven & Spring

---

## Personal Techstack

* DbVisualizer für Datenbankankzugriff (commercial)
* [AsciiDoc](https://asciidoc.org) & [PlantUML](https://plantuml.com) für Dokumentation
* [Bear](https://bear.app) für Notizen mit Markdown (commercial)
* [Deckset](https://www.deckset.com) für Präsentation mit Markdown (commercial)

---

![fit](images/what-is-your-next-move.jpg)

--- 

![](./images/questions-and-answers.jpg)

---

![](./images/pexels-vie-studio-4439457.jpg)
 

---

## Resources

* [Criminal Court: Microsoft's email block a wake-up call for digital sovereignty](https://www.heise.de/en/news/Criminal-Court-Microsoft-s-email-block-a-wake-up-call-for-digital-sovereignty-10387383.html)
* [Österreichs Bundesheer stellt auf LibreOffice um](https://www.heise.de/news/Oesterreichs-Bundesheer-stellt-auf-LibreOffice-um-10660756.html)
* [EU cloud provider: Broadcom raised VMware license prices by 800 to 1500 percent](https://www.heise.de/en/news/EU-cloud-provider-Broadcom-raised-VMware-license-prices-by-800-to-1500-percent-10394974.html)
* [Microsoft Can't Keep EU Data Safe From US Authorities](https://www.forbes.com/sites/emmawoollacott/2025/07/22/microsoft-cant-keep-eu-data-safe-from-us-authorities/)
* [US-Provider würden Kundendaten aushändigen](https://www.cloudcomputing-insider.de/us-provider-wuerden-kundendaten-aushaendigen-a-364c44646df82831e3e471606bf122df/)

---

## Resources

* [Trump befiehlt – Microsoft sperrt E-Mail-Account?](https://www.computerwoche.de/article/3989073/trump-befiehlt-microsoft-sperrt-e-mail-account.html)
* [The Document Foundation](https://www.documentfoundation.org)
