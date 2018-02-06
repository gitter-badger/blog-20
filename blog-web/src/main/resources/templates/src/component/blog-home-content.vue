<style lang="css">
  #blog-home-content {
    font-size: 16px;
  }

  #blog-home-content div.title {
    border: 1px solid #f6f6f6;
    padding: 10px;
    color: #333;
  }

  #blog-home-content .blog-block-card {
    margin-bottom: 10px;
  }

  #blog-home-content div.content {
    padding: 10px;
  }

  #blog-home-content div.content .blog-card {
    margin-bottom: 5px;
  }

  #blog-home-content div.content .blog-data-browse > div.content {
    background-color: #F8F8F8;
  }

  #blog-home-content div.content .blog-ui-jd > div.content {
    height: 300px;
    overflow: auto;
  }

  #blog-home-content div.content .blog-card .blog-block {
    background-color: #F8F8F8;
    border-radius: 5px;
    padding: 10px;
    text-align: center;
    height: 80px;
  }

  #blog-home-content div.content .pending-event {
    background-color: #F8F8F8;
    border-radius: 5px;
    padding: 10px;
    height: 80px;
  }

  #blog-home-content div.content .pending-event > div {
    color: #999;
    font-size: 14px;
    margin-bottom: 5px;
  }

  #blog-home-content div.content .pending-event > span {
    font-size: 26px;
    color: #009688;
  }

  #blog-home-content div.content .version-info {
    height: 168px;
  }

  #blog-home-content ul.blog-carousel {
    display: inline-block;
    padding: 0px;
    margin: 2px 0px 0px 0px;
  }

  #blog-home-content ul.blog-carousel > li {
    width: 10px;
    height: 10px;
    background-color: #e2e2e2;
    border-radius: 5px;
    float: left;
    margin: 0px 5px 0px 5px;
    cursor: pointer;
  }

  #blog-home-content ul.blog-carousel .blog-carousel-this {
    background-color: #b3b3b3;
  }

</style>

<template>
  <div id="blog-home-content">
    <el-row :gutter="5">
      <el-col class="blog-block-card" :xl="8" :lg="8" :md="12">
        <el-card :body-style="{ padding: '0px' }">
          <div class="title">
            <span>快捷方式</span>
            <ul class="blog-carousel pull-right">
              <li @click="shortcut()" index="1" class="blog-carousel-this"></li>
              <li @click="shortcut()" index="2"></li>
            </ul>
          </div>
          <div class="content">
            <el-row :gutter="5">
              <el-col class="blog-card" :xl="6" :lg="6" :md="6" :sm="6" :xs="6" v-for="i in 8">
                <div class="blog-block">
                  <i class="el-icon-picture-outline"></i>
                  <div>相册</div>
                </div>
              </el-col>
            </el-row>
          </div>
        </el-card>
      </el-col>

      <el-col class="blog-block-card" :xl="8" :lg="8" :md="12">
        <el-card :body-style="{ padding: '0px' }">
          <div class="title">
            <span>待办事件</span>
            <ul class="blog-carousel pull-right">
              <li class="blog-carousel-this"></li>
              <li></li>
            </ul>
          </div>
          <div class="content">
            <el-row :gutter="5">
              <el-col class="blog-card" :xl="12" :lg="12" :md="12" :sm="12" :xs="12" v-for="i in 4">
                <div class="pending-event">
                  <div>待审评论</div>
                  <span>66</span>
                </div>
              </el-col>
            </el-row>
          </div>
        </el-card>
      </el-col>

      <el-col class="blog-block-card" :xl="8" :lg="8">
        <el-card :body-style="{ padding: '0px' }">
          <div class="title">
            <span>版本信息</span>
          </div>
          <div class="content">
            <el-row :gutter="5">
              <el-col class="blog-card">
                <div class="version-info">
                  <table class="table table-bordered">
                    <tbody>
                    <tr>
                      <td align="">当前版本</td>
                      <td>v1.0.0</td>
                    </tr>
                    <tr>
                      <td>基于框架</td>
                      <td>Bootstrap,Vue,ElementUI,jQuery</td>
                    </tr>
                    <tr>
                      <td>主要特色</td>
                      <td>没特色</td>
                    </tr>
                    <tr>
                      <td>获取渠道</td>
                      <td>xxx</td>
                    </tr>
                    </tbody>
                  </table>
                </div>
              </el-col>
            </el-row>
          </div>
        </el-card>
      </el-col>

      <el-col class="blog-block-card" :xl="16" :lg="16">
        <el-card :body-style="{ padding: '0px' }">
          <div class="title">
            <span>数据预览</span>
            <ul class="blog-carousel pull-right">
              <li class="blog-carousel-this"></li>
              <li></li>
              <li></li>
            </ul>
          </div>
          <div class="content">
            <el-row :gutter="5">
              <el-col class="blog-card blog-data-browse">
                <div id="demo-charts" class="content" style="height: 300px;width: 1036px">

                </div>
              </el-col>
            </el-row>
          </div>
        </el-card>
      </el-col>

      <el-col class="blog-block-card" :xl="8" :lg="8">
        <el-card :body-style="{ padding: '0px' }">
          <div class="title">进度条</div>
          <div class="content">
            <el-row :gutter="5">
              <el-col class="blog-card blog-ui-jd">
                <div class="content">
                  <h4>BootStrap</h4>
                  <h5>进度条组件使用与按钮和警告框相同的类，根据不同情境展现相应的效果。</h5>
                  <div class="progress">
                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40"
                         aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                      <span class="sr-only">40% Complete (success)</span>
                    </div>
                  </div>
                  <div class="progress">
                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0"
                         aria-valuemax="100" style="width: 20%">
                      <span class="sr-only">20% Complete</span>
                    </div>
                  </div>
                  <div class="progress">
                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60"
                         aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                      <span class="sr-only">60% Complete (warning)</span>
                    </div>
                  </div>
                  <div class="progress">
                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80"
                         aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                      <span class="sr-only">80% Complete (danger)</span>
                    </div>
                  </div>

                  <h4>条纹效果</h4>
                  <h5>通过渐变可以为进度条创建条纹效果，IE9 及更低版本不支持。</h5>
                  <div class="progress">
                    <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar"
                         aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                      <span class="sr-only">40% Complete (success)</span>
                    </div>
                  </div>
                  <div class="progress">
                    <div class="progress-bar progress-bar-info progress-bar-striped" role="progressbar"
                         aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                      <span class="sr-only">20% Complete</span>
                    </div>
                  </div>
                  <div class="progress">
                    <div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar"
                         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                      <span class="sr-only">60% Complete (warning)</span>
                    </div>
                  </div>
                  <div class="progress">
                    <div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar"
                         aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                      <span class="sr-only">80% Complete (danger)</span>
                    </div>
                  </div>

                  <h4>ElementUI</h4>
                  <h5>线形进度条 — 百分比外显</h5>
                  <el-progress :percentage="0"></el-progress>
                  <el-progress :percentage="70"></el-progress>
                  <el-progress :percentage="100" status="success"></el-progress>
                  <el-progress :percentage="50" status="exception"></el-progress>

                  <h5>线形进度条 — 百分比内显</h5>
                  <el-progress :text-inside="true" :stroke-width="18" :percentage="0"></el-progress>
                  <el-progress :text-inside="true" :stroke-width="18" :percentage="70"></el-progress>
                  <el-progress :text-inside="true" :stroke-width="18" :percentage="100" status="success"></el-progress>
                  <el-progress :text-inside="true" :stroke-width="18" :percentage="50" status="exception"></el-progress>

                  <h5>环形进度条</h5>
                  <el-progress type="circle" :percentage="0"></el-progress>
                  <el-progress type="circle" :percentage="25"></el-progress>
                  <el-progress type="circle" :percentage="100" status="success"></el-progress>
                  <el-progress type="circle" :percentage="50" status="exception"></el-progress>
                </div>
              </el-col>
            </el-row>
          </div>
        </el-card>
      </el-col>


      <el-col class="blog-block-card" :xl="16" :lg="16">
        <el-card :body-style="{ padding: '0px' }">
          <el-tabs v-model="activeName" @tab-click="handleClick">
            <el-tab-pane label="今日热搜" name="first">
              <el-table
                :data="tableData"
                style="width: 100%">
                <el-table-column
                  type="index"
                  :index="indexMethod">
                </el-table-column>
                <el-table-column
                  prop="keyword"
                  label="关键字"
                  width="180">
                </el-table-column>
                <el-table-column
                  prop="searchSize"
                  label="搜索次数"
                  width="180">
                </el-table-column>
                <el-table-column
                  prop="releaseUser"
                  label="发布用户">
                </el-table-column>
              </el-table>
              <el-pagination
                :page-sizes="[100, 200, 300, 400]"
                :page-size="100"
                layout="total, sizes, prev, pager, next, jumper"
                :total="400">
              </el-pagination>
            </el-tab-pane>
            <el-tab-pane label="今日热帖" name="second">
              <el-table
                :data="tableData"
                style="width: 100%">
                <el-table-column
                  type="index"
                  :index="indexMethod">
                </el-table-column>
                <el-table-column
                  prop="keyword"
                  label="关键字"
                  width="180">
                </el-table-column>
                <el-table-column
                  prop="searchSize"
                  label="搜索次数"
                  width="180">
                </el-table-column>
                <el-table-column
                  prop="releaseUser"
                  label="发布用户">
                </el-table-column>
              </el-table>
              <el-pagination
                :page-sizes="[100, 200, 300, 400]"
                :page-size="100"
                layout="total, sizes, prev, pager, next, jumper"
                :total="400">
              </el-pagination>
            </el-tab-pane>
          </el-tabs>
        </el-card>
      </el-col>

      <el-col class="blog-block-card" :xl="8" :lg="8">
        <el-card :body-style="{ padding: '0px' }">
          <div class="title">
            <span>产品信息</span>
            <ul class="blog-carousel pull-right">
              <li class="blog-carousel-this"></li>
              <li></li>
            </ul>
          </div>
          <div class="content">
            <el-row :gutter="5">
              <el-col class="blog-card ">
                <div class="content" style="width: 100%">
                  <p> 当前UI整体布局是参考其他UI编写，主要目的用于学习和使用前台工具</p>

                </div>
              </el-col>
            </el-row>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>

  export default {
    name: 'blog-home-content',
    data() {
      return {
        activeName: 'first',
        tableData: [{
          keyword: 'x',
          searchSize: Math.round(Math.random() * 100),
          releaseUser: 'pengliang'
        }, {
          keyword: 'x',
          searchSize: Math.round(Math.random() * 100),
          releaseUser: 'pengliang'
        }, {
          keyword: 'x',
          searchSize: Math.round(Math.random() * 100),
          releaseUser: 'pengliang'
        }, {
          keyword: 'x',
          searchSize: Math.round(Math.random() * 100),
          releaseUser: 'pengliang'
        }, {
          keyword: 'x',
          searchSize: Math.round(Math.random() * 100),
          releaseUser: 'pengliang'
        }]
      }
    },
    mounted: function () {
      var demoChartsElem = document.getElementById("demo-charts");
      var demo = echarts.init(demoChartsElem);
      demo.setOption({
        title: {
          text: '浏览器分布情况',
          subtext: '纯属虚构',
          x: 'center'
        },
        tooltip: {
          trigger: 'item',
          formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
          orient: 'vertical',
          left: 'left',
          data: ['Chrome', 'Firefox', 'Safari', 'IE', '其他']
        },
        series: [
          {
            name: '访问来源',
            type: 'pie',
            radius: '55%',
            center: ['50%', '60%'],
            data: [
              {value: 335, name: 'Chrome'},
              {value: 310, name: 'Firefox'},
              {value: 234, name: 'Safari'},
              {value: 135, name: 'IE'},
              {value: 1548, name: '其他'}
            ],
            itemStyle: {
              emphasis: {
                shadowBlur: 10,
                shadowOffsetX: 0,
                shadowColor: 'rgba(0, 0, 0, 0.5)'
              }
            }
          }
        ]
      });
      $(window).resize(function () {
        demo.resize()
      });
      $(demoChartsElem).css("width", "100%");
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      },
      indexMethod(index) {
        return index + 1;
      },
      shortcut: function () {
        $(event.currentTarget).parent().children().removeClass('blog-carousel-this');
        $(event.currentTarget).addClass('blog-carousel-this');
      }
    }
  }
</script>
