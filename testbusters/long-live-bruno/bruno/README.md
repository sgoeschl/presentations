# Bruno Collection

Here you find a Bruno collection to play around with [{JSON} Placeholder](https://jsonplaceholder.typicode.com)

* The *prod* environment configuration uses https://jsonplaceholder.typicode.com
* The *dev* environment configuration uses a [Docker container](https://github.com/svenwal/jsonplaceholder.docker)

```
docker run -d -p 3000:3000 svenwal/jsonplaceholder
4fac559f76211ba23748d3f3d290505e0db2933e177c4baa73bf56b600904e0b
```

You need to create the **.env** file yourself because the file is deliberately NOT under version control

```
dev.X-API-Key=00000000-0000-0000-0000-000000000000
prod.X-API-Key=12e43cce-1221-4467-9983-a57b3b62360c
```

Please note that the remote [{JSON} Placeholder](https://jsonplaceholder.typicode.com) is a read-only API where no
changes are supported while the Docker Container allows modifying the data set.

## Command Line Execution

You can pass the desired environment configuration to `bru`

```text
> bru run --env dev --reporter-html report.html
> bru run --env prod --reporter-html report.html
```

and here you see an example output

```
> bru run --env dev --reporter-html report.html
01-ping/01-head-all-users (200 OK) - 18 ms
Assertions
   ✓ res.status: eq 200
02-smoke-test/01-get-all-albums (200 OK) - 52 ms
Assertions
   ✓ res.status: eq 200
02-smoke-test/02-get-all-posts (200 OK) - 54 ms
Assertions
   ✓ res.status: eq 200
02-smoke-test/03-get-all-users (200 OK) - 52 ms
Assertions
   ✓ res.status: eq 200
02-smoke-test/04-get-user-by-id (200 OK) - 7 ms
02-smoke-test/05-get-all-posts-by-user (200 OK) - 50 ms
Assertions
   ✓ res.status: eq 200
02-smoke-test/06-get-all-todo-by-user (200 OK) - 53 ms
Assertions
   ✓ res.status: eq 200
02-smoke-test/07-get-all-albums-by-user (200 OK) - 9 ms
Assertions
   ✓ res.status: eq 200
03-create-user/01-create-user (201 Created) - 20 ms
03-create-user/02-get-all-users (200 OK) - 71 ms
Assertions
   ✓ res.status: eq 200
03-create-user/03-delete-user-by-id (200 OK) - 101 ms
Assertions
   ✓ res.status: eq 200
03-create-user/04-get-user-by-id (404 Not Found) - 10 ms
Assertions
   ✓ res.status: eq 404
04-create-blog-post/01-get-all-users (200 OK) - 48 ms
Assertions
   ✓ res.status: eq 200
04-create-blog-post/02-create-new-post (201 Created) - 10 ms
Assertions
   ✓ res.status: eq 201
   ✓ res.headers['location']: isNotEmpty
   ✓ res.body.id: gt 0
04-create-blog-post/03-get-all-posts (200 OK) - 62 ms
Assertions
   ✓ res.status: eq 200
04-create-blog-post/04-delete-post-by-id (200 OK) - 90 ms
Assertions
   ✓ res.status: eq 200
04-create-blog-post/05-get-post-by-id (404 Not Found) - 7 ms
Post-Response Tests
   ✓ should not find deleted blog post
   ✓ should return empty response

📊 Execution Summary
┌───────────────┬────────────────┐
│ Metric        │     Result     │
├───────────────┼────────────────┤
│ Status        │     ✓ PASS     │
├───────────────┼────────────────┤
│ Requests      │ 17 (17 Passed) │
├───────────────┼────────────────┤
│ Tests         │      0/0       │
├───────────────┼────────────────┤
│ Assertions    │     16/16      │
├───────────────┼────────────────┤
│ Duration (ms) │      714       │
└───────────────┴────────────────┘
Wrote html results to report.html
```

## Bruno Meets Jenkins

The `Jenkinsfile` allows to easily run the Bruno collection in Jenkins
 
| Parameter                                                   | Value                                           |
|-------------------------------------------------------------|-------------------------------------------------|
| Pipeline / Definition                                       | Pipeline script from SCM                        |
| Pipeline / Definition / SCM                                 | Git                                             |
| Pipeline / Definition / SCM / Repositories / Repository URL | https://github.com/sgoeschl/presentations.git   |
| Script Path                                                 | ./testbusters/long-live-bruno/bruno/Jenkinsfile |

```text
Started by user admin
Obtained ./testbusters/long-live-bruno/bruno/Jenkinsfile from git https://github.com/sgoeschl/presentations.git
[Pipeline] Start of Pipeline
[Pipeline] node
Running on Jenkins in /Users/sgoeschl/.jenkins/workspace/long-live-bruno
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Checkout SCM)
[Pipeline] checkout
The recommended git tool is: git
No credentials specified
 > git rev-parse --resolve-git-dir /Users/sgoeschl/.jenkins/workspace/long-live-bruno/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/sgoeschl/presentations.git # timeout=10
Fetching upstream changes from https://github.com/sgoeschl/presentations.git
 > git --version # timeout=10
 > git --version # 'git version 2.50.1 (Apple Git-155)'
 > git fetch --tags --force --progress -- https://github.com/sgoeschl/presentations.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/master^{commit} # timeout=10
Checking out Revision 25cf28eefbb994621b74b854cebb1e49632d49a6 (refs/remotes/origin/master)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 25cf28eefbb994621b74b854cebb1e49632d49a6 # timeout=10
Commit message: "BRUNO-001 Add Jenkins build file"
 > git rev-list --no-walk 25cf28eefbb994621b74b854cebb1e49632d49a6 # timeout=10
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
[Pipeline] isUnix
[Pipeline] withEnv
[Pipeline] {
[Pipeline] sh
+ docker inspect -f . node:20-alpine
.
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] withDockerContainer
Jenkins does not seem to be running inside a container
$ docker run -t -d -u 501:20 -u root -w /Users/sgoeschl/.jenkins/workspace/long-live-bruno -v /Users/sgoeschl/.jenkins/workspace/long-live-bruno:/Users/sgoeschl/.jenkins/workspace/long-live-bruno:rw,z -v /Users/sgoeschl/.jenkins/workspace/long-live-bruno@tmp:/Users/sgoeschl/.jenkins/workspace/long-live-bruno@tmp:rw,z -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** node:20-alpine cat
$ docker top 2f22cd06f8989c2258461361956450255807fdd3986a12690df0930acac64576 -eo pid,comm
[Pipeline] {
[Pipeline] ansiColor
[Pipeline] {

[Pipeline] timestamps
[Pipeline] {
[Pipeline] timeout
22:56:23  Timeout set to expire in 30 min
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Checkout)
[Pipeline] checkout
22:56:23  The recommended git tool is: git
22:56:23  No credentials specified
22:56:23  Warning: JENKINS-30600: special launcher org.jenkinsci.plugins.docker.workflow.WithContainerStep$Decorator$1@c1e5185; decorates hudson.Launcher$LocalLauncher@220cc1ab will be ignored (a typical symptom is the Git executable not being run inside a designated container)
22:56:23   > git rev-parse --resolve-git-dir /Users/sgoeschl/.jenkins/workspace/long-live-bruno/.git # timeout=10
22:56:23  Fetching changes from the remote Git repository
22:56:23   > git config remote.origin.url https://github.com/sgoeschl/presentations.git # timeout=10
22:56:23  Fetching upstream changes from https://github.com/sgoeschl/presentations.git
22:56:23   > git --version # timeout=10
22:56:23   > git --version # 'git version 2.50.1 (Apple Git-155)'
22:56:23   > git fetch --tags --force --progress -- https://github.com/sgoeschl/presentations.git +refs/heads/*:refs/remotes/origin/* # timeout=10
22:56:23   > git rev-parse refs/remotes/origin/master^{commit} # timeout=10
22:56:23  Checking out Revision 25cf28eefbb994621b74b854cebb1e49632d49a6 (refs/remotes/origin/master)
22:56:23   > git config core.sparsecheckout # timeout=10
22:56:23   > git checkout -f 25cf28eefbb994621b74b854cebb1e49632d49a6 # timeout=10
22:56:23  Commit message: "BRUNO-001 Add Jenkins build file"
[Pipeline] sh
22:56:24  + ls -la
22:56:24  total 32
22:56:24  drwxr-xr-x   14 root     root           448 Feb 26 21:18 .
22:56:24  drwxr-xr-x    4 root     root          4096 Feb 26 21:56 ..
22:56:24  -rw-r--r--    1 root     root           104 Feb 26 21:18 .env
22:56:24  drwxr-xr-x   12 root     root           384 Feb 26 21:56 .git
22:56:24  -rw-r--r--    1 root     root           352 Feb 26 21:04 .gitignore
22:56:24  -rw-r--r--    1 root     root         11357 Feb 26 21:04 LICENSE
22:56:24  -rw-r--r--    1 root     root          3243 Feb 26 21:04 README.md
22:56:24  drwxr-xr-x    4 root     root           128 Feb 26 21:04 agiletestautomation
22:56:24  drwxr-xr-x    3 root     root            96 Feb 26 21:04 cmg
22:56:24  drwxr-xr-x    4 root     root           128 Feb 26 21:04 java2days
22:56:24  drwxr-xr-x    6 root     root           192 Feb 26 21:04 javameetup
22:56:24  -rw-r--r--    1 root     root           710 Feb 26 21:04 pom.xml
22:56:24  drwxr-xr-x    4 root     root           128 Feb 26 21:04 testbusters
22:56:24  drwxr-xr-x    3 root     root            96 Feb 26 21:04 wearedevelopers
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Prepare .env (optional))
[Pipeline] dir
22:56:24  Running in /Users/sgoeschl/.jenkins/workspace/long-live-bruno/testbusters/long-live-bruno/bruno
[Pipeline] {
[Pipeline] script
[Pipeline] {
[Pipeline] writeFile
[Pipeline] echo
22:56:24  Wrote .env from Jenkins-provided environment variables.
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // dir
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Install Bruno CLI)
[Pipeline] sh
22:56:25  + node --version
22:56:25  v20.20.0
22:56:25  + npm --version
22:56:25  10.8.2
[Pipeline] sh
22:56:25  + npm install -g @usebruno/cli@latest
22:56:40  npm warn deprecated whatwg-encoding@3.1.1: Use @exodus/bytes instead for a more spec-conformant and faster implementation
22:56:40  
22:56:40  added 422 packages in 15s
22:56:40  
22:56:40  60 packages are looking for funding
22:56:40    run `npm fund` for details
[Pipeline] sh
22:56:40  + bru --version
22:56:41  3.1.3
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Run Bruno Collection)
[Pipeline] dir
22:56:41  Running in /Users/sgoeschl/.jenkins/workspace/long-live-bruno/testbusters/long-live-bruno/bruno
[Pipeline] {
[Pipeline] sh
22:56:41  + bru run --env prod --reporter-html report.html
22:56:42  System proxy detection failed after 6ms: Linux proxy detection failed: No Linux proxy configuration found
22:56:42  Error getting system proxy: Error: Linux proxy detection failed: No Linux proxy configuration found
22:56:42      at LinuxProxyResolver.detect (/usr/local/lib/node_modules/@usebruno/cli/node_modules/@usebruno/requests/dist/cjs/index.js:98:129682)
22:56:42      at process.processTicksAndRejections (node:internal/process/task_queues:95:5)
22:56:42      at async SystemProxyResolver.detectByPlatform (/usr/local/lib/node_modules/@usebruno/cli/node_modules/@usebruno/requests/dist/cjs/index.js:98:133637)
22:56:42      at async SystemProxyResolver.detectSystemProxy (/usr/local/lib/node_modules/@usebruno/cli/node_modules/@usebruno/requests/dist/cjs/index.js:98:133144)
22:56:42      at async SystemProxyResolver.getSystemProxy (/usr/local/lib/node_modules/@usebruno/cli/node_modules/@usebruno/requests/dist/cjs/index.js:98:133025)
22:56:42      at async getSystemProxy (/usr/local/lib/node_modules/@usebruno/cli/node_modules/@usebruno/requests/dist/cjs/index.js:98:134299)
22:56:42      at async Object.handler (/usr/local/lib/node_modules/@usebruno/cli/src/commands/run.js:778:40)
22:56:42  01-ping/01-head-all-users (200 OK) - 119 ms
22:56:42  Assertions
22:56:42     ✓ res.status: eq 200
22:56:43  02-smoke-test/01-get-all-albums (200 OK) - 79 ms
22:56:43  Assertions
22:56:43     ✓ res.status: eq 200
22:56:43  02-smoke-test/02-get-all-posts (200 OK) - 83 ms
22:56:43  Assertions
22:56:43     ✓ res.status: eq 200
22:56:43  02-smoke-test/03-get-all-users (200 OK) - 76 ms
22:56:43  Assertions
22:56:43     ✓ res.status: eq 200
22:56:43  02-smoke-test/04-get-user-by-id (200 OK) - 77 ms
22:56:43  02-smoke-test/05-get-all-posts-by-user (200 OK) - 74 ms
22:56:43  Assertions
22:56:43     ✓ res.status: eq 200
22:56:44  02-smoke-test/06-get-all-todo-by-user (200 OK) - 80 ms
22:56:44  Assertions
22:56:44     ✓ res.status: eq 200
22:56:44  02-smoke-test/07-get-all-albums-by-user (200 OK) - 72 ms
22:56:44  Assertions
22:56:44     ✓ res.status: eq 200
22:56:44  03-create-user/01-create-user (201 Created) - 393 ms
22:56:44  03-create-user/02-get-all-users (200 OK) - 73 ms
22:56:44  Assertions
22:56:44     ✓ res.status: eq 200
22:56:45  03-create-user/03-delete-user-by-id (200 OK) - 186 ms
22:56:45  Assertions
22:56:45     ✓ res.status: eq 200
22:56:45  03-create-user/04-get-user-by-id (404 Not Found) - 75 ms
22:56:45  Assertions
22:56:45     ✓ res.status: eq 404
22:56:45  04-create-blog-post/01-get-all-users (200 OK) - 75 ms
22:56:45  Assertions
22:56:45     ✓ res.status: eq 200
22:56:45  04-create-blog-post/02-create-new-post (201 Created) - 177 ms
22:56:45  Assertions
22:56:45     ✓ res.status: eq 201
22:56:45     ✓ res.headers['location']: isNotEmpty
22:56:45     ✓ res.body.id: gt 0
22:56:45  04-create-blog-post/03-get-all-posts (200 OK) - 74 ms
22:56:45  Assertions
22:56:45     ✓ res.status: eq 200
22:56:46  04-create-blog-post/04-delete-post-by-id (200 OK) - 182 ms
22:56:46  Assertions
22:56:46     ✓ res.status: eq 200
22:56:46  04-create-blog-post/05-get-post-by-id (404 Not Found) - 74 ms
22:56:46  Post-Response Tests
22:56:46     ✓ should not find deleted blog post
22:56:46     ✓ should return empty response
22:56:46  
22:56:46  📊 Execution Summary
22:56:46  ┌───────────────┬────────────────┐
22:56:46  │ Metric        │     Result     │
22:56:46  ├───────────────┼────────────────┤
22:56:46  │ Status        │     ✓ PASS     │
22:56:46  ├───────────────┼────────────────┤
22:56:46  │ Requests      │ 17 (17 Passed) │
22:56:46  ├───────────────┼────────────────┤
22:56:46  │ Tests         │      0/0       │
22:56:46  ├───────────────┼────────────────┤
22:56:46  │ Assertions    │     16/16      │
22:56:46  ├───────────────┼────────────────┤
22:56:46  │ Duration (ms) │      1969      │
22:56:46  └───────────────┴────────────────┘
22:56:46  Wrote html results to report.html
[Pipeline] }
[Pipeline] // dir
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Archive Report)
[Pipeline] archiveArtifacts
22:56:46  Archiving artifacts
22:56:46  Recording fingerprints
[Pipeline] script
[Pipeline] {
[Pipeline] publishHTML
22:56:46  [htmlpublisher] Archiving HTML reports...
22:56:46  [htmlpublisher] Archiving at BUILD level /Users/sgoeschl/.jenkins/workspace/long-live-bruno/testbusters/long-live-bruno/bruno to Bruno_20Report
22:56:46  [htmlpublisher] Copying recursive using current thread
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Declarative: Post Actions)
[Pipeline] echo
22:56:47  Build finished with status: SUCCESS
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // timeout
[Pipeline] }
[Pipeline] // timestamps
[Pipeline] }

[Pipeline] // ansiColor
[Pipeline] }
$ docker stop --time=1 2f22cd06f8989c2258461361956450255807fdd3986a12690df0930acac64576
$ docker rm -f --volumes 2f22cd06f8989c2258461361956450255807fdd3986a12690df0930acac64576
[Pipeline] // withDockerContainer
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS
```