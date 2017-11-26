SUMMARY = "Socket.IO integration for Flask applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38cc21254909604298ce763a6e4440a0"

PYPI_PACKAGE = "Flask-SocketIO"

RDEPENDS_${PN} = "python-flask \
                  python-socketio \
                  python-engineio \
                  python-gevent \
                  python-gevent-websocket \
                  python-numbers \
                  python-netserver \
"

SRC_URI[md5sum] = "1f8521101d2c9b4155cf521fbce3740c"
SRC_URI[sha256sum] = "0fb686f9d85f4f34dc6609f62fa96fe15176a6ea7e6179149d319fabc54c543b"

PR = "r9"

inherit pypi setuptools
