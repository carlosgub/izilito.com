{
  mode: 'development',
  resolve: {
    modules: [
      'node_modules'
    ]
  },
  plugins: [
    ProgressPlugin {
      profile: false,
      handler: [Function: handler],
      modulesCount: 5000,
      dependenciesCount: 10000,
      showEntries: true,
      showModules: true,
      showDependencies: true,
      showActiveModules: false,
      percentBy: undefined
    },
    TeamCityErrorPlugin {}
  ],
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [
          'source-map-loader'
        ],
        enforce: 'pre'
      }
    ]
  },
  entry: {
    main: [
      '/home/carlos/IdeaProjects/compose-web/build/js/packages/compose-web/kotlin/compose-web.js'
    ]
  },
  output: {
    path: '/home/carlos/IdeaProjects/compose-web/build/distributions',
    filename: [Function: filename],
    library: 'compose-web',
    libraryTarget: 'umd',
    globalObject: 'this'
  },
  devtool: 'eval-source-map',
  ignoreWarnings: [
    /Failed to parse source map/
  ],
  devServer: {
    open: true,
    static: [
      '/home/carlos/IdeaProjects/compose-web/build/processedResources/js/main'
    ]
  },
  stats: {
    warnings: false,
    errors: false
  }
}