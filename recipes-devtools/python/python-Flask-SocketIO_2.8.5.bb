SUMMARY = "Socket.IO integration for Flask applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38cc21254909604298ce763a6e4440a0"

RDEPENDS_${PN} = "python-flask \
                  python-socketio \
                  python-engineio \
                  python-gevent \
                  python-gevent-websocket \
                  python-numbers \
                  python-netserver \
"

SRC_URI[md5sum] = "0b59cc04a3efb0dd6922d162b8bbf88e"
SRC_URI[sha256sum] = "1f4fc467b2b4b94786d51c7c210f2bd05a419e4adc7cbfa4e4218e74a4c96fdd"

PR = "r8"

inherit pypi setuptools
