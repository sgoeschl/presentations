# Evil Performance Testing

## Abstract

The infamous “Pointy Haired Boss” is promoting his new flagship product - GRUNTMASTER 7000. Let's follow a fictional journey of a prospective customer deciding if GRUNTMASTER 7000 fulfills his performance requirements - double-checking performance test reports, reading between the lines of percentile charts, understanding the effect of workload models and seeing the impact of coordinated omission.

## Keywords

performance testing, coordinated omission, workload models

## Inspiration

Inspired bi Gil Tene's presentations, I wondered if it is possible to come up with a nice-looking (and **real**) performance test report even if the SUT is completely broken and stalls repeatedly with a stop-the-world GC, e.g. stalling every 50 seconds for 10 seconds. I extended [StringBoot HTTPBin](https://github.com/dyrnq/springboot-httpbin) and used JMeter to create a "good" and a "bad" performance test report demonstrating the effect of coordinated omission, different workload models and the danger of percentile charts.

## About The Speaker

Siegfried is a grumpy Senior Software Engineer and infamous for his motivation skills and management presentations. He also spent too much time in the Open Source community such as Apache Turbine, Apache Commons, Apache JSPWiki and Apache Freemarker but decided to become an ASF emeritus member in 03/2025. When not writing Java backend code he tinkers with performance testing & engineering, helps at the Java Meetup Vienna & DevFest Vienna and never spend enough time on the bicycle.

* [LinkedIn Profile](https://www.linkedin.com/in/siegfried-goeschl-0410432/)
* [XING Profile](https://www.xing.com/profile/Siegfried_Goeschl)
* [GitHub Profile](https://github.com/sgoeschl)

## What ChatGPT Says About The Speaker

Siegfried Göschl is an Austrian software engineer and consultant with extensive experience in server-side Java development, full-text search, performance testing, quality assurance, and build management. He currently serves as the Chief Technology Officer (CTO) at ASCIIFISH, a position he has held since February 2017.

Throughout his career, Göschl has contributed significantly to the open-source community. He is a member of the Apache Software Foundation (ASF), participating in the Project Management Committees (PMC) for Apache Turbine and JSPWiki. Over the past decade, he has also been involved with Apache Commons, working on projects like commons-email and commons-exec, as well as contributing to Apache XML-RPC and Apache Maven.

Göschl's professional journey includes roles such as Senior Software Engineer at Erste Group IT International GmbH and willhaben internet service GmbH & Co KG, where he led technical projects and developed infrastructure components. He has also served as a Solution Architect at Santander Consumer Bank GmbH, bridging business analysis, development, and operations teams across various projects.

In addition to his technical roles, Göschl actively engages with the local developer community in Vienna. He has been involved in organizing events like the GDG DevFest and contributes to the local Java User Group, sharing his knowledge and fostering community growth.
