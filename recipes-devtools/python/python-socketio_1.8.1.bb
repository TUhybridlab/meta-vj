SUMMARY = "A socket.io client library."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = "python-engineio \
"

PYPI_PACKAGE = "python-socketio"

SRC_URI[md5sum] = "ae922f1489dbb16c82eb276de299327f"
SRC_URI[sha256sum] = "f42d02bf6f446c09e0bd2f7842734dfc4eb49e5079130060a0e29068bd0cad29"

PR = "r4"

inherit pypi setuptools
