SUMMARY = "Engine.IO server."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = "python-six \
"

PYPI_PACKAGE = "python-engineio"

SRC_URI[md5sum] = "379fe9c3630337533c0b79098b0bdf8b"
SRC_URI[sha256sum] = "fca35c7e4af42475552d53eea04a9280e2ccd331a032f41d17290ff3125a2291"

PR = "r4"

inherit pypi setuptools
