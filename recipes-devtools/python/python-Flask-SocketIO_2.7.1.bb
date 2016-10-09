SUMMARY = "Socket.IO integration for Flask applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=da3f5c3e7289cd8d3cef97904f85c757"

RDEPENDS_${PN} = "python-flask \
                  python-socketio \
                  python-engineio \
                  python-gevent \
                  python-gevent-websocket \
                  python-numbers \
                  python-netserver \
"

SRC_URI[md5sum] = "9710332e17262e8f1efc81dcefffd8c0"
SRC_URI[sha256sum] = "93407798fddd7258fdd1fc7f4c50251d2f7cbcc820194312920dac62748d0e65"

PR = "r8"

inherit pypi setuptools
