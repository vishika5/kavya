var http=require("http");
http.createServer(function(request,response)
{
response.writeHead(200,{'content-Type':'text/plain'})
response.end('hello node js program\n')
}).listen(5500);
console.log("server executing on http://127.0.0.1:5500/");