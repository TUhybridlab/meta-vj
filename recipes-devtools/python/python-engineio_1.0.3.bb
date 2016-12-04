SUMMARY = "Engine.IO server."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=593402c27c908e00846086871661ba7d"

RDEPENDS_${PN} = "python-six \
"

PYPI_PACKAGE = "python-engineio"

SRC_URI[md5sum] = "6b7707dac9f9139fec859a45d940fee7"
SRC_URI[sha256sum] = "30803f9d3c327a27bdbf6e55a9772c858082c69de87b750ff981effd47386e5c"

PR = "r2"

inherit pypi setuptools
