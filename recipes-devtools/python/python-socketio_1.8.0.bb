SUMMARY = "A socket.io client library."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = "python-six \
                  python-engineio \
"

PYPI_PACKAGE = "python-socketio"

SRC_URI[md5sum] = "325aee1a7a1585dbb0416c3178d7833b"
SRC_URI[sha256sum] = "4d662601c2fec639b5bb8fdfdb1c53cac73c44efb0b39ee428184bddf2f49479"

PR = "r3"

inherit pypi setuptools
