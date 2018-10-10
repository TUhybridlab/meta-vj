SUMMARY = "Engine.IO server."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = " \
  python-six \
  python-compression \
"

PYPI_PACKAGE = "python-engineio"

SRC_URI[md5sum] = "92d2e1b62083ce8f0dcd8fd905b0dd9d"
SRC_URI[sha256sum] = "871f4d022eb9171e380281266ba2aef0759b264ba862350bc94e7a597a98a443"

PR = "r0"

inherit pypi setuptools
