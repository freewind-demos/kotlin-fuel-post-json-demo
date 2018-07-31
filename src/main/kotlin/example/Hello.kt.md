```
------------- request ---------------
"Body : {"foo": "bar"}"
"Headers : (2)"
Accept-Encoding : compress;q=0.5, gzip;q=1.0
Content-Type : application/json

--------------- response -----------------
<-- 200 (http://httpbin.org/post)
Response : OK
Length : 553
Body : ({
  "args": {},
  "data": "{\"foo\": \"bar\"}",
  "files": {},
  "form": {},
  "headers": {
    "Accept": "text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2",
    "Accept-Encoding": "compress;q=0.5, gzip;q=1.0",
    "Cache-Control": "no-cache",
    "Connection": "close",
    "Content-Length": "14",
    "Content-Type": "application/json",
    "Host": "httpbin.org",
    "Pragma": "no-cache",
    "User-Agent": "Java/1.8.0_162"
  },
  "json": {
    "foo": "bar"
  },
  "origin": "219.144.248.241",
  "url": "http://httpbin.org/post"
}
)
Headers : (8)
Server : [gunicorn/19.9.0]
Access-Control-Allow-Origin : [*]
Access-Control-Allow-Credentials : [true]
Connection : [keep-alive]
Content-Length : [553]
Date : [Tue, 31 Jul 2018 12:18:20 GMT]
Via : [1.1 vegur]
Content-Type : [application/json]

--------------- third ------------------
[Success: {
  "args": {},
  "data": "{\"foo\": \"bar\"}",
  "files": {},
  "form": {},
  "headers": {
    "Accept": "text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2",
    "Accept-Encoding": "compress;q=0.5, gzip;q=1.0",
    "Cache-Control": "no-cache",
    "Connection": "close",
    "Content-Length": "14",
    "Content-Type": "application/json",
    "Host": "httpbin.org",
    "Pragma": "no-cache",
    "User-Agent": "Java/1.8.0_162"
  },
  "json": {
    "foo": "bar"
  },
  "origin": "219.144.248.241",
  "url": "http://httpbin.org/post"
}
]
```