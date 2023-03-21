#!/bin/bash

gh repo create my-birdogss-svc --public
git init
git remote add origin git@github.com:bmoussaud/my-birdogss-svc.git
git branch -M main
git add -A  .
git commit -m "initial commit"
git push -u origin main
open https://github.com/bmoussaud/my-birdogss-svc