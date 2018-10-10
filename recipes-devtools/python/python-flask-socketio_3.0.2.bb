SUMMARY = "Socket.IO integration for Flask applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38cc21254909604298ce763a6e4440a0"

PYPI_PACKAGE = "Flask-SocketIO"

RDEPENDS_${PN} = " \
  python-flask \
  python-socketio \
  python-gevent-websocket \
"

SRC_URI[md5sum] = "50a4d55bf3c6574a21ea4a5cc995ea21"
SRC_URI[sha256sum] = "3da4a08c482acf0f3ab9ffb15fe6d820c1deacfa1a906f6e98cbab40795f57c3"

PR = "r0"

inherit pypi setuptools
