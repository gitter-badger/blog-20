# blog

> #### UI结构

```
├── blog-web 前台模块

├─── src/main/java 后台代码

├─── src/main/resources/templates blog后台UI

├──── src 源码目录
```


> #### 修改左菜单

修改 src/main/resources/templates/src/component/data/blog.left.menu.json
```
[
  {
    "name": "我的博客",
    "iocn":"el-icon-location",
    "type":"submenu",
    "child": [
      {
        "name": "CSS3",
        "child": [
          {
            "group": "介绍"
          }
        ]
      },
      {
        "name": "Bootstrap"
      }
    ]
  },
 ....
]
```
name ： 标题

iocn ：图标

type ：submenu(下拉展示)/group(分组展示)

child ：子菜单 

目前只有两级目录

