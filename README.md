## 学习Google Protocol Buffer
目前流量运营平台的接口协议是基于HTTP的<http://www.yingtongnet.com/doc/api.html>

学习了protobuf之后，把原来的JSON格式换成protobuf协议
## protoc 的使用
<https://blog.csdn.net/giskook/article/details/10108997>

```
protoc --java_out=d:\kxe --proto_path=C:\Users\Administrator\workspace\FluxProtobuf\src\main\resources C:\Users\Administrator\workspace\FluxProtobuf\src\main\resources\*.proto
```

一个proto文件里import另一个proto文件的时候一定要加双引号：

```
import "commonRequestHeader.proto";
```

否则会报错：Expected a string naming the file to import.

