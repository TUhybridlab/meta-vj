SUMMARY = "A socket.io client library."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = "python-six \
                  python-engineio \
"

PYPI_PACKAGE = "python-socketio"

SRC_URI[md5sum] = "808045ba69eed8eba994b8629334d7f6"
SRC_URI[sha256sum] = "d9b3c2ffe23705fa651482c1d45e55561283649686a80d3ffd9ed695de21e2fa"

PR = "r2"

inherit pypi setuptools
