# Introduction

This is a Yocto layer for the Virtual Jump Simulator. It provides:

 * static IP address hack (recipes-core)
 * additional Python dependencies not (yet) present in OpenEmbedded (recipes-devtools)
 * the recipes for the individual server (recipes-server)
 * the recipe for Maxon Motor's `libeposcmd`. **If you wish to build this** be
   sure to first download the approiate binary from https://www.maxonmotor.com/

# Usage

This is not meant to be used on its own, but as a part of https://github.com/j-be/vj-control-server-buildenv
