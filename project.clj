(defproject gitstat "0.1.0-SNAPSHOT"
						:dependencies [[org.clojure/clojure "1.6.0"]
													 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
													 [org.clojure/clojurescript "0.0-3126"]
													 [com.cemerick/piggieback "0.1.6-SNAPSHOT"]
													 [org.clojure/tools.nrepl "0.2.7"]
													 ;[jira "0.1.0-SNAPSHOT"]
													 ]

						:node-dependencies [[source-map-support "0.2.8"]
																]

						:plugins [[lein-cljsbuild "1.0.5"]
											[lein-npm "0.4.0"]
											]

						:hooks [leiningen.cljsbuild]

						:source-paths ["src", "target/classes"]

						:repl-options {
													 :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

						:cljsbuild
						{:builds
						 {:main
							{
							 :source-paths ["src"]

							 :compiler     {
															:output-to             "out/gitstat.js"
															:output-dir            "out"
															:target                :nodejs
															:optimizations         :none
															:source-map            "out/smap"
															:cache-analysis        true
															:static-fns            true
															:verbose               true
															:print-input-delimiter true
															}
							 }}
						 }
						)