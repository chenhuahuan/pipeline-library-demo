#!/usr/bin/env groovy

def call(String name = 'human') {
  import com.cleverbuilder.GlobalVars
  println GlobalVars.foo
  echo "Hello, I am ${name}."
}

