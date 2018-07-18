SUMMARY = "A socket.io client library."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = " \
  python-engineio \
"

PYPI_PACKAGE = "python-socketio"

SRC_URI[md5sum] = "585b059f684c354fd8f2956daa727864"
SRC_URI[sha256sum] = "bde24ef6132a3c2e1b24e77847b31d331abdf8da8c711f0ef9cee4785000e023"

PR = "r0"

inherit pypi setuptools
