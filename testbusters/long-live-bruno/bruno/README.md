# Bruno Collection

Here you find a Bruno collection to play around with [{JSON} Placeholder](https://jsonplaceholder.typicode.com)

* The *prod* environment configuration uses https://jsonplaceholder.typicode.com
* The *dev* environment configuration uses a [Docker container](https://github.com/svenwal/jsonplaceholder.docker)

```
docker run -d -p 3000:3000 svenwal/jsonplaceholder
4fac559f76211ba23748d3f3d290505e0db2933e177c4baa73bf56b600904e0b
```

Please note that the remote [{JSON} Placeholder](https://jsonplaceholder.typicode.com) is a read-only API where no changes are supported while the Docker Container allows modifying the data set.

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
````