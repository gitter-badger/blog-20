var path = require('path')
var webpack = require('webpack')
module.exports = {
  //入口文件
  entry: './src/main.js',
  //出口
  output: {
    //输出目录
    path: path.resolve(__dirname, './dist'),
    //图片等引用会根据当前路劲打包修改
    publicPath: 'dist/',
    //输出文件
    filename: 'build.js'
  },
  //加载解析模块
  module: {
    rules: [
      {
        test: /\.css$/,
        // use:['style-loader','css-loader','less-loader']
        loader: 'style-loader!css-loader'
      }, {
        test: /\.less/,
        loader: 'style-loader!css-loader!less-loader'
      }, {
        test: /\.vue$/,
        loader: 'vue-loader',
        options: {
          loaders: {}
          // other vue-loader options go here
        }
      },
      {
        test: /\.js$/,
        loader: 'babel-loader',
        exclude: /node_modules/
      },
      {
        test: /\.(png|jpe?g|gif|eot|svg|ttf|woff|woff2)(\?\S*)?$/,
        loader: 'file-loader',
        options: {
          name: 'images/[name].[ext]?[hash]'
        }
      },
      {
        test: /\.json$/,
        loader: 'json-loader',
        options: {
          name: 'data/[name].[ext]?[hash]'
        }
      }
      /*,
      {
        test: /\.html$/,
        use: {
          loader: 'html-loader'
        },
        options: {
          name: '[name].[ext]?[hash]'
        }
      },
       {
        test: /\.(png|jpe?g|gif|eot|svg|ttf|woff|woff2)(\?\S*)?$/,
        use: {
          loader: 'url-loader'
        },
        options: {
          name: '[name].[ext]?[hash]',
          publicPath:'./'
        }
      }
      */
    ]
  },
  resolve: {
    alias: {
      'vue$': 'vue/dist/vue.esm.js'
    },
    extensions: ['*', '.js', '.vue', '.json']
  },
  devServer: {
    historyApiFallback: true,
    noInfo: true,
    overlay: true
  },
  performance: {
    hints: false
  },
  plugins: [new webpack.ProvidePlugin({
    $: "jquery",
    jquery: "jquery",
    "window.jQuery": "jquery",
    jQuery: "jquery"
  }), new webpack.ProvidePlugin({
    waves: "node-waves/dist/waves.min",
    "window.waves": "node-waves/dist/waves.min"
  })],
  devtool: '#eval-source-map'
}


if (process.env.NODE_ENV === 'production') {
  module.exports.devtool = '#source-map'
  // http://vue-loader.vuejs.org/en/workflow/production.html
  module.exports.plugins = (module.exports.plugins || []).concat([
    new webpack.DefinePlugin({
      'process.env': {
        NODE_ENV: '"production"'
      }
    })
    , new webpack.optimize.UglifyJsPlugin({
      sourceMap: true,
      compress: {
        warnings: false
      }
    }),
    new webpack.LoaderOptionsPlugin({
      minimize: true
    })
  ])
}
