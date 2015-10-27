#!/bin/sh
#
# Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
#
# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.
#


(
	cd javadoc/target/site/apidocs
	git init
	git config user.name "Travis-CI"
	git config user.email "travis@seedstack.org"
	git add .
	git commit -m "Built for gh-pages of http://seedstack.github.io/javadoc"
	git push --force --quiet "https://${GITHUB_TOKEN}@github.com/seedstack/javadoc" master:gh-pages > /dev/null 2>&1
)
