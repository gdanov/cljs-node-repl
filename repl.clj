(require '[cljs.repl.node :as node]
				 '[cemerick.piggieback :as piggieback])

(piggieback/cljs-repl :repl-env (node/repl-env)
											:output-dir "out"
											:optimizations :none
											:cache-analysis true
											:static-fns true
											:target :nodejs
											:source-map true)

(require 'clojure.string :reload)
(require 'repl.two :reload)