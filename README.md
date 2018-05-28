## 学习Google Protocol Buffer
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

